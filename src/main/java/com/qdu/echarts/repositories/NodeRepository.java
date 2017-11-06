package com.qdu.echarts.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qdu.echarts.entities.base.Persons;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.Family;
import com.qdu.echarts.entities.base.GovHelp;

/**
 * 
 * 可使用@Query注解添加对数据库的各种操作。
 *
 */
@Repository
public interface NodeRepository extends GraphRepository<Persons>{
//	@Query("Match (start:Persons{name:{name}})-[n:rel*1..1]-(end:Persons) return start,end,n")
//	Iterable<Persons> findPersonsByName(@Param("name")String name);
//	
//	@Query("Match (start:Persons{name:{name}})-[n:rel*1..2]-(end:Persons) return start,end,n")
//	Iterable<Persons> addProperty(@Param("name")String name);
//	
//	@Query("match (n:Persons) where n.name='青岛大学'  return n")
//	Iterable<Persons> findalltest();
//	
//	@Query("MATCH (a:Persons { name:{startname} }),(b:Person { name:{endname} }), p = shortestPath((a)-[*..15]-(b)) RETURN p")
//	Iterable<Persons> findRelByName(@Param("startname")String startname,@Param("endname")String endname);
	
//	@Query("MATCH (n:Resident) RETURN n LIMIT 25")
//	Iterable<Resident> findResident();
	
	@Query("Match (start:BasicInfo)-[n]-(end) return start,end,n Limit 20")
	Iterable<BasicInfo> findoneBasicInfo();
	
}
