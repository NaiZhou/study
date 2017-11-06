package com.qdu.echarts.entities.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.qdu.echarts.entities.base.AbstractEntity;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.GovHelp;
import com.qdu.echarts.entities.base.HelpPerson;
import com.qdu.echarts.entities.base.Family;

/**
 * 
 * 数据库中关系类型为rel，name属性为关系名称。
 *
 */
@RelationshipEntity(type = "HAS_HELPPERSON")
public class HAS_HELPPERSON extends AbstractEntity {

	@StartNode
	private BasicInfo startnode;

	@EndNode
	private HelpPerson endnode;

	
	

	public BasicInfo getStartnode() {
		return startnode;
	}




	public void setStartnode(BasicInfo startnode) {
		this.startnode = startnode;
	}




	public HelpPerson getEndnode() {
		return endnode;
	}




	public void setEndnode(HelpPerson endnode) {
		this.endnode = endnode;
	}




	@Override
	public String toString() {
		return "HELPED_BY [startperson=" + startnode.getHuzhuxingming() + ", endperson=" + endnode.getBangfudanweimingcheng() + "]";
	}
	
	

}
