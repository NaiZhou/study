package com.qdu.echarts.entities.base;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * neo4j数据库配置，通过http方式连接数据库
 * url：http://neo4j:root@localhost:7474，用户名：neo4j,密码：root
 * driver：org.neo4j.ogm.drivers.http.driver.HttpDriver
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "com.qdu.echarts.repositories")
@EnableTransactionManagement
public class GraphDBConfiguration extends Neo4jConfiguration {

	  @Bean
	   public org.neo4j.ogm.config.Configuration getConfiguration() {
	       org.neo4j.ogm.config.Configuration config = new org.neo4j.ogm.config.Configuration();
	       config.driverConfiguration()
	               .setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver")
	               .setURI("http://neo4j:root@localhost:7474");
	       return config;
	   }

   @Override
   @Bean
   public SessionFactory getSessionFactory() {
      // Return the session factory which also includes the persistent entities
      return new SessionFactory(getConfiguration(), "com.qdu.echarts.entities");
   }
}