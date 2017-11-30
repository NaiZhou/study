package com.qdu.echarts.beans;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_BANGFUXIANGMU;
import com.qdu.echarts.entities.relationships.HAS_BANGFUREN;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;

public class BangFuRenBean {
	private Long id;
	private String name;
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

	public String getBangfurenxingming() {
		return bangfurenxingming;
	}



	public void setBangfurenxingming(String bangfurenxingming) {
		this.bangfurenxingming = bangfurenxingming;
	}


	public BangFuRenBean(Long id, String name, String bangfurenxingming, int category) {
		super();
		this.id = id;
		this.name = name;
		this.bangfurenxingming = bangfurenxingming;
		this.category = category;
	}

	public BangFuRenBean() {
	}
	
	  @Override
	    public boolean equals(Object obj) {
	        if(obj == null) return false;
	        if(this == obj) return true;
	        if(obj instanceof BangFuRenBean){ 
	        	BangFuRenBean user =(BangFuRenBean)obj;
//	          if(user.id = this.id) return true; // ֻ�Ƚ�id
	            // �Ƚ�id��username һ��ʱ�ŷ���true ֮����ȥ�Ƚ� hashCode
	            if(user.id == this.id && user.bangfurenxingming.equals(this.bangfurenxingming)) return true;
	            }
	        return false;
	    }
	 
	 
	 
	    /**
	     * ��дhashcode ���������ص�hashCode ��һ�����϶�Ϊ��ͬ�Ķ���
	     */
	    @Override
	    public int hashCode() {
//	      return id.hashCode(); // ֻ�Ƚ�id��idһ���Ͳ���ӽ�����
	        return id.hashCode() * bangfurenxingming.hashCode();
	    }
	 
}
