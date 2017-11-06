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
	
	
	private String url;
	private int category;	


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




	public Imagebean(String url, int category) {
		super();
		this.url = url;
		this.category = category;
	}




	public Imagebean() {
	}
	
}
