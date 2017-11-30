package com.qdu.echarts.entities.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.qdu.echarts.entities.base.AbstractEntity;
import com.qdu.echarts.entities.base.BangFuRen;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.GovHelp;
import com.qdu.echarts.entities.base.HelpPerson;
import com.qdu.echarts.entities.base.Family;

/**
 * 
 * 数据库中关系类型为rel，name属性为关系名称。
 *
 */
@RelationshipEntity(type = "HAS_BANGFUREN")
public class HAS_BANGFUREN extends AbstractEntity {

	@StartNode
	private BangFuRen startnode;

	@EndNode
	private BasicInfo endnode;

	private String bangfukaishishijian;
	



	public BangFuRen getStartnode() {
		return startnode;
	}




	public void setStartnode(BangFuRen startnode) {
		this.startnode = startnode;
	}




	public BasicInfo getEndnode() {
		return endnode;
	}




	public void setEndnode(BasicInfo endnode) {
		this.endnode = endnode;
	}




	public String getBangfukaishishijian() {
		return bangfukaishishijian;
	}




	public void setBangfukaishishijian(String bangfukaishishijian) {
		this.bangfukaishishijian = bangfukaishishijian;
	}




	@Override
	public String toString() {
		return "HAS_BANGFUREN [startnode=" + startnode + ", endnode=" + endnode + "]";
	}




 
	

}
