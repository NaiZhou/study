package com.qdu.echarts.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qdu.echarts.entities.base.Persons;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.Family;
import com.qdu.echarts.entities.base.GovHelp;
import com.qdu.echarts.entities.base.HelpPerson;

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
	
	@Query("MATCH (a) where a.bangfurenxingming={startname} or a.huzhuxingming={startname} or a.xingming={startname}  match (b) where b.bangfurenxingming={endname} or b.huzhuxingming={endname} or b.xingming={endname} match p = shortestPath((a)-[*..15]-(b)) return p")
	Iterable<Object> findRelByName(@Param("startname")String startname,@Param("endname")String endname);
	
//	@Query("MATCH (n:Resident) RETURN n LIMIT 25")
//	Iterable<Resident> findResident();
	
	@Query("Match (start:BasicInfo)-[n]-(end) return start,end,n Limit 50")
	Iterable<BasicInfo> findoneBasicInfo();
	
	@Query("match (n)-[r]-(end) where n.huzhuxingming={name}   return n,r,end")
	Iterable<BasicInfo> findByName(@Param("name")String name);
	
	@Query("match (n:BasicInfo)-[r]-(p) where n.huzhuxingming={name} return n,r,p")
	Iterable<BasicInfo> findBasicInfoByName(@Param("name")String name);
	
	@Query("match (n:Family)-[r*1..2]-(p) where n.xingming={name} return n,r,p")
	Iterable<BasicInfo> findFamilyByName(@Param("name")String name);
	
	@Query("match (n:BangFuRen)-[r*1..2]-(p) where n.bangfurenxingming={name} return n,r,p")
	Iterable<BasicInfo> findBangFuRenByName(@Param("name")String name);
	
	@Query("match(n) where n.bangfurenxingming={name} or n.huzhuxingming={name} or n.xingming={name} match (n)-[r*1..1]-(p) return n,r,p")
	Iterable<Object> findName(@Param("name")String name);
	
	@Query("MATCH (n:Family) RETURN n LIMIT 25")
	Iterable<Family> test();
	

	
	
	
}
