package com.qdu.echarts.entities.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.qdu.echarts.entities.base.AbstractEntity;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.GovHelp;
import com.qdu.echarts.entities.base.HelpPerson;
import com.qdu.echarts.entities.base.Image;
import com.qdu.echarts.entities.base.Family;

/**
 * 
 * 数据库中关系类型为rel，name属性为关系名称。
 *
 */
@RelationshipEntity(type = "HAS_IMAGE")
public class HAS_IMAGE extends AbstractEntity {

	@StartNode
	private BasicInfo startnode;

	@EndNode
	private Image endnode;



	public BasicInfo getStartnode() {
		return startnode;
	}



	public void setStartnode(BasicInfo startnode) {
		this.startnode = startnode;
	}



	public Image getEndnode() {
		return endnode;
	}



	public void setEndnode(Image endnode) {
		this.endnode = endnode;
	}



	@Override
	public String toString() {
		return "HELPED_BY [startperson=" + startnode.getHuzhuxingming() + ", endperson=" + endnode.getUrl() + "]";
	}
	
	

}
