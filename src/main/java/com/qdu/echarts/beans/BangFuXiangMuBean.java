package com.qdu.echarts.beans;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_BANGFUXIANGMU;
import com.qdu.echarts.entities.relationships.HAS_BANGFUREN;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;

public class BangFuXiangMuBean {
	private Long id;
	private String name;
	private String xiangmumingcheng;
	private int category;

	public int getCategory() {
		return category;
	}

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

	public void setCategory(int category) {
		this.category = category;
	}

	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}

	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}

	public BangFuXiangMuBean(Long id, String name, String xiangmumingcheng, int category) {
		super();
		this.id = id;
		this.name = name;
		this.xiangmumingcheng = xiangmumingcheng;
		this.category = category;
	}

	public BangFuXiangMuBean() {
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof BangFuXiangMuBean) {
			BangFuXiangMuBean user = (BangFuXiangMuBean) obj;
			// if(user.id = this.id) return true; // 只比较id
			// 比较id和username 一致时才返回true 之后再去比较 hashCode
			if (user.id == this.id && user.xiangmumingcheng.equals(this.xiangmumingcheng))
				return true;
		}
		return false;
	}

	/**
	 * 重写hashcode 方法，返回的hashCode 不一样才认定为不同的对象
	 */
	@Override
	public int hashCode() {
		// return id.hashCode(); // 只比较id，id一样就不添加进集合
		return id.hashCode() * xiangmumingcheng.hashCode();
	}

}
