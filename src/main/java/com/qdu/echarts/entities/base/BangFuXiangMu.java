package com.qdu.echarts.entities.base;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_BANGFUXIANGMU;
import com.qdu.echarts.entities.relationships.HAS_BANGFUREN;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;

@NodeEntity
public class BangFuXiangMu  extends AbstractEntity{
	
	@Relationship(type="HAS_FAMILY", direction=Relationship.INCOMING)
	private Set<HAS_FAMILY> has_family;
	
	@Relationship(type="HAS_BANGFUXIANGMU", direction=Relationship.INCOMING)
	private Set<HAS_BANGFUXIANGMU> has_govhelp;
	
	@Relationship(type="HAS_BANGFUREN", direction=Relationship.INCOMING)
	private Set<HAS_BANGFUREN> has_helpperson;
	
	@Relationship(type="HAS_IMAGE", direction=Relationship.INCOMING)
	private Set<HAS_IMAGE> has_image;
	
	private String xiangmumingcheng;
	private static int catetory = 3;
	
	


	public Set<HAS_FAMILY> getHas_family() {
		return has_family;
	}



	public void setHas_family(Set<HAS_FAMILY> has_family) {
		this.has_family = has_family;
	}



	public Set<HAS_BANGFUXIANGMU> getHas_govhelp() {
		return has_govhelp;
	}



	public void setHas_govhelp(Set<HAS_BANGFUXIANGMU> has_govhelp) {
		this.has_govhelp = has_govhelp;
	}



	public Set<HAS_BANGFUREN> getHas_helpperson() {
		return has_helpperson;
	}



	public void setHas_helpperson(Set<HAS_BANGFUREN> has_helpperson) {
		this.has_helpperson = has_helpperson;
	}



	public Set<HAS_IMAGE> getHas_image() {
		return has_image;
	}



	public void setHas_image(Set<HAS_IMAGE> has_image) {
		this.has_image = has_image;
	}



	public static int getCatetory() {
		return catetory;
	}



	public static void setCatetory(int catetory) {
		BangFuXiangMu.catetory = catetory;
	}



	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}



	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}


	public BangFuXiangMu(String xiangmumingcheng) {
		super();
		this.xiangmumingcheng = xiangmumingcheng;
	}



	public BangFuXiangMu() {
	}
}
