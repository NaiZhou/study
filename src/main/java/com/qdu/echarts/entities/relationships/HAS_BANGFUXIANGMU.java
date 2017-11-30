package com.qdu.echarts.entities.relationships;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.qdu.echarts.entities.base.AbstractEntity;
import com.qdu.echarts.entities.base.BangFuRen;
import com.qdu.echarts.entities.base.BangFuXiangMu;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.GovHelp;
import com.qdu.echarts.entities.base.Family;

/**
 * 
 * 数据库中关系类型为rel，name属性为关系名称。
 *
 */
@RelationshipEntity(type = "HAS_BANGFUXIANGMU")
public class HAS_BANGFUXIANGMU extends AbstractEntity {

	@StartNode
	private BangFuXiangMu startnode;

	@EndNode
	private BasicInfo endnode;


	private String fuchinianfen;
	private String jiansheneirong;
	
	public BangFuXiangMu getStartnode() {
		return startnode;
	}
	public void setStartnode(BangFuXiangMu startnode) {
		this.startnode = startnode;
	}
	public BasicInfo getEndnode() {
		return endnode;
	}
	public void setEndnode(BasicInfo endnode) {
		this.endnode = endnode;
	}
	public String getFuchinianfen() {
		return fuchinianfen;
	}
	public void setFuchinianfen(String fuchinianfen) {
		this.fuchinianfen = fuchinianfen;
	}
	public String getJiansheneirong() {
		return jiansheneirong;
	}
	public void setJiansheneirong(String jiansheneirong) {
		this.jiansheneirong = jiansheneirong;
	}
	@Override
	public String toString() {
		return "HAS_BANGFUXIANGMU [startnode=" + startnode + ", endnode=" + endnode + ", fuchinianfen=" + fuchinianfen
				+ ", jiansheneirong=" + jiansheneirong + "]";
	}

	



	

}
