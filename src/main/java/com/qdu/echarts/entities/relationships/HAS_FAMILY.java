package com.qdu.echarts.entities.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.qdu.echarts.entities.base.AbstractEntity;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.Persons;
import com.qdu.echarts.entities.base.Family;

/**
 * 
 * 数据库中关系类型为rel，name属性为关系名称。
 *
 */
@RelationshipEntity(type = "HAS_FAMILY")
public class HAS_FAMILY extends AbstractEntity {

	@StartNode
	private BasicInfo startnode;

	@EndNode
	private Family endnode;
	
	private String relation;

	
	public BasicInfo getStartnode() {
		return startnode;
	}


	public void setStartnode(BasicInfo startnode) {
		this.startnode = startnode;
	}


	public Family getEndnode() {
		return endnode;
	}


	public void setEndnode(Family endnode) {
		this.endnode = endnode;
	}


	public String getRelation() {
		return relation;
	}


	public void setRelation(String relation) {
		this.relation = relation;
	}


	@Override
	public String toString() {
		return "HELPED_BY [startperson=" + startnode.getHuzhuxingming() + ", endperson=" + endnode.getXingming() + "]";
	}
	
	

}
