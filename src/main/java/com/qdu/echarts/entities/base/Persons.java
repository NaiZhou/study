package com.qdu.echarts.entities.base;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;

@NodeEntity
public class Persons extends Person {
	//数据库关系数据类型全部为rel
	@Relationship(type="rel", direction=Relationship.INCOMING)
	private Set<HAS_FAMILY> rel;

	public Set<HAS_FAMILY> getRel() {
		return rel;
	}

	public void setRel(Set<HAS_FAMILY> rel) {
		this.rel = rel;
	}

	@Override
	public String toString() {
		return "name=" +this.getName() + ", info=" + this.getInfo() + ", tel=" + this.getTel() + ", add=" + this.getAdd()+ ", remark=" +this.getRemark()
				+ ", date=" + this.getDate();
	}
	
	
}
