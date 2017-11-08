package com.qdu.echarts.beans;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_GOVHELP;
import com.qdu.echarts.entities.relationships.HAS_HELPPERSON;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;

/**
 * 数据包含name和info，不能写ID，ID属性echarts无法读取，无法通过ID连接节点关系
 */
public class Imagebean {
	private Long id;
	private String name;
	private String url;
	private int category;	


	public String getName() {
		return name;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
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




	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}



	public Imagebean(String url) {
		super();
		this.url = url;
	}




	public Imagebean(Long id ,String name,String url, int category) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.category = category;
	}




	public Imagebean() {
	}
	
}
