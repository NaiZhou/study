package com.qdu.echarts.entities.base;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_GOVHELP;
import com.qdu.echarts.entities.relationships.HAS_HELPPERSON;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;

@NodeEntity
public class GovHelp  extends AbstractEntity{
	
	@Relationship(type="HAS_FAMILY", direction=Relationship.INCOMING)
	private Set<HAS_FAMILY> has_family;
	
	@Relationship(type="HAS_GOVHELP", direction=Relationship.INCOMING)
	private Set<HAS_GOVHELP> has_govhelp;
	
	@Relationship(type="HAS_HELPPERSON", direction=Relationship.INCOMING)
	private Set<HAS_HELPPERSON> has_helpperson;
	
	@Relationship(type="HAS_IMAGE", direction=Relationship.INCOMING)
	private Set<HAS_IMAGE> has_image;
	
	private String xiangmumingcheng;
	private String huzhu_id;
	private String fuchinianfen;
	private String xiangmuleibie;
	private String zijinzonge_yuan;
	private String jiansheneirong;
	private static int catetory = 3;
	
	


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
		GovHelp.catetory = catetory;
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

	




	public GovHelp(String xiangmumingcheng, String huzhu_id, String fuchinianfen, String xiangmuleibie,
			String zijinzonge_yuan, String jiansheneirong) {
		super();
		this.xiangmumingcheng = xiangmumingcheng;
		this.huzhu_id = huzhu_id;
		this.fuchinianfen = fuchinianfen;
		this.xiangmuleibie = xiangmuleibie;
		this.zijinzonge_yuan = zijinzonge_yuan;
		this.jiansheneirong = jiansheneirong;
	}



	public GovHelp() {
	}
}
