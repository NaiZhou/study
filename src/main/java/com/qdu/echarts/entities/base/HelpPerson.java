package com.qdu.echarts.entities.base;

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
@NodeEntity
public class HelpPerson extends AbstractEntity{
	
	@Relationship(type="HAS_FAMILY", direction=Relationship.INCOMING)
	private Set<HAS_FAMILY> has_family;
	
	@Relationship(type="HAS_GOVHELP", direction=Relationship.INCOMING)
	private Set<HAS_GOVHELP> has_govhelp;
	
	@Relationship(type="HAS_HELPPERSON", direction=Relationship.INCOMING)
	private Set<HAS_HELPPERSON> has_helpperson;
	
	@Relationship(type="HAS_IMAGE", direction=Relationship.INCOMING)
	private Set<HAS_IMAGE> has_image;
	
	
	private String huzhu_id;
	private String bangfukaishishijian;
	private String lianxidianhua;
	private String danweilishuguanxi;
	private String bangfujieshushijian;
	private String bangfudanweimingcheng;
	private String bangfurenxingming;
	private static int catetory = 4;
	
	
	




	public Set<HAS_FAMILY> getHas_family() {
		return has_family;
	}



	public void setHas_family(Set<HAS_FAMILY> has_family) {
		this.has_family = has_family;
	}



	public Set<HAS_GOVHELP> getHas_govhelp() {
		return has_govhelp;
	}



	public void setHas_govhelp(Set<HAS_GOVHELP> has_govhelp) {
		this.has_govhelp = has_govhelp;
	}



	public Set<HAS_HELPPERSON> getHas_helpperson() {
		return has_helpperson;
	}



	public void setHas_helpperson(Set<HAS_HELPPERSON> has_helpperson) {
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
		HelpPerson.catetory = catetory;
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

	

	
	


	public HelpPerson(String huzhu_id, String bangfukaishishijian, String lianxidianhua, String danweilishuguanxi,
			String bangfujieshushijian, String bangfudanweimingcheng, String bangfurenxingming) {
		super();
		this.huzhu_id = huzhu_id;
		this.bangfukaishishijian = bangfukaishishijian;
		this.lianxidianhua = lianxidianhua;
		this.danweilishuguanxi = danweilishuguanxi;
		this.bangfujieshushijian = bangfujieshushijian;
		this.bangfudanweimingcheng = bangfudanweimingcheng;
		this.bangfurenxingming = bangfurenxingming;
	}



	public HelpPerson() {
	}
	
}
