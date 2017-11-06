package com.qdu.echarts.beans;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_GOVHELP;
import com.qdu.echarts.entities.relationships.HAS_HELPPERSON;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;


public class GovHelpbean{
	private String xiangmumingcheng;
	private String huzhu_id;
	private String fuchinianfen;
	private String xiangmuleibie;
	private String zijinzonge_yuan;
	private String jiansheneirong;
	private int category;

	




	public int getCategory() {
		return category;
	}



	public void setCategory(int category) {
		this.category = category;
	}



	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}



	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}



	public String getHuzhu_id() {
		return huzhu_id;
	}



	public void setHuzhu_id(String huzhu_id) {
		this.huzhu_id = huzhu_id;
	}



	public String getFuchinianfen() {
		return fuchinianfen;
	}



	public void setFuchinianfen(String fuchinianfen) {
		this.fuchinianfen = fuchinianfen;
	}



	public String getXiangmuleibie() {
		return xiangmuleibie;
	}



	public void setXiangmuleibie(String xiangmuleibie) {
		this.xiangmuleibie = xiangmuleibie;
	}



	public String getZijinzonge_yuan() {
		return zijinzonge_yuan;
	}



	public void setZijinzonge_yuan(String zijinzonge_yuan) {
		this.zijinzonge_yuan = zijinzonge_yuan;
	}



	public String getJiansheneirong() {
		return jiansheneirong;
	}



	public void setJiansheneirong(String jiansheneirong) {
		this.jiansheneirong = jiansheneirong;
	}

	




	public GovHelpbean(String xiangmumingcheng, String huzhu_id, String fuchinianfen, String xiangmuleibie,
			String zijinzonge_yuan, String jiansheneirong,int category) {
		super();
		this.xiangmumingcheng = xiangmumingcheng;
		this.huzhu_id = huzhu_id;
		this.fuchinianfen = fuchinianfen;
		this.xiangmuleibie = xiangmuleibie;
		this.zijinzonge_yuan = zijinzonge_yuan;
		this.jiansheneirong = jiansheneirong;
		this.category = category;
	}



	public GovHelpbean() {
	}
}
