package com.qdu.echarts.entities.base;


import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Person extends AbstractEntity {
	private String name;
	private String info;
	private int tel;
	
	private String add;
	private String remark;
	private String date;
	
	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	

	
}
