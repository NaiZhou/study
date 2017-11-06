package com.qdu.echarts.entities.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.qdu.echarts.entities.base.AbstractEntity;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.GovHelp;
import com.qdu.echarts.entities.base.Family;

/**
 * 
 * ���ݿ��й�ϵ����Ϊrel��name����Ϊ��ϵ���ơ�
 *
 */
@RelationshipEntity(type = "HAS_GOVHELP")
public class HAS_GOVHELP extends AbstractEntity {

	@StartNode
	private BasicInfo startnode;

	@EndNode
	private GovHelp endnode;

	

	public BasicInfo getStartnode() {
		return startnode;
	}



	public void setStartnode(BasicInfo startnode) {
		this.startnode = startnode;
	}



	public GovHelp getEndnode() {
		return endnode;
	}



	public void setEndnode(GovHelp endnode) {
		this.endnode = endnode;
	}



	@Override
	public String toString() {
		return "HELPED_BY [startperson=" + startnode.getHuzhuxingming() + ", endperson=" + endnode.getXiangmumingcheng() + "]";
	}
	
	

}
