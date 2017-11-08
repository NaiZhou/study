package com.qdu.echarts.beans;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_GOVHELP;
import com.qdu.echarts.entities.relationships.HAS_HELPPERSON;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;

public class HelpPersonbean {
	private Long id;
	private String name;
	private String huzhu_id;
	private String bangfukaishishijian;
	private String lianxidianhua;
	private String danweilishuguanxi;
	private String bangfujieshushijian;
	private String bangfudanweimingcheng;
	private String bangfurenxingming;
	private int category;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCategory() {
		return category;
	}



	public void setCategory(int category) {
		this.category = category;
	}



	public String getHuzhu_id() {
		return huzhu_id;
	}



	public void setHuzhu_id(String huzhu_id) {
		this.huzhu_id = huzhu_id;
	}



	public String getBangfukaishishijian() {
		return bangfukaishishijian;
	}



	public void setBangfukaishishijian(String bangfukaishishijian) {
		this.bangfukaishishijian = bangfukaishishijian;
	}



	public String getLianxidianhua() {
		return lianxidianhua;
	}



	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}



	public String getDanweilishuguanxi() {
		return danweilishuguanxi;
	}



	public void setDanweilishuguanxi(String danweilishuguanxi) {
		this.danweilishuguanxi = danweilishuguanxi;
	}



	public String getBangfujieshushijian() {
		return bangfujieshushijian;
	}



	public void setBangfujieshushijian(String bangfujieshushijian) {
		this.bangfujieshushijian = bangfujieshushijian;
	}





	public String getBangfurenxingming() {
		return bangfurenxingming;
	}



	public void setBangfurenxingming(String bangfurenxingming) {
		this.bangfurenxingming = bangfurenxingming;
	}

	





	public String getBangfudanweimingcheng() {
		return bangfudanweimingcheng;
	}



	public void setBangfudanweimingcheng(String bangfudanweimingcheng) {
		this.bangfudanweimingcheng = bangfudanweimingcheng;
	}

	

	
	




	public HelpPersonbean(Long id ,String name,String huzhu_id, String bangfukaishishijian, String lianxidianhua, String danweilishuguanxi,
			String bangfujieshushijian, String bangfudanweimingcheng, String bangfurenxingming,int category) {
		super();
		this.id = id;
		this.name = name;
		this.huzhu_id = huzhu_id;
		this.bangfukaishishijian = bangfukaishishijian;
		this.lianxidianhua = lianxidianhua;
		this.danweilishuguanxi = danweilishuguanxi;
		this.bangfujieshushijian = bangfujieshushijian;
		this.bangfudanweimingcheng = bangfudanweimingcheng;
		this.bangfurenxingming = bangfurenxingming;
		this.category = category;
	}



	public HelpPersonbean() {
	}
	
}
