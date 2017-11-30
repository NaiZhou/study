package com.qdu.echarts.beans;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_BANGFUXIANGMU;
import com.qdu.echarts.entities.relationships.HAS_BANGFUREN;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;


public class Familybean{
	private Long id;
	private String name;
	private String xingming;
	private String wugongshijian;
	private String huzhu_id;
	private String wenhuachengdu;
	private String yuhuzhuguanxi;
	private String xinxingnongcunhezuoyiliao;
	private String zaixiaoshengzhuangkuang;
	private String chengxiangjuminyanglaobaoxian;
	private String laodongnengli;
	private String canjizhenghaoma;
	private  int category;	
	
	
	
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

	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public String getWugongshijian() {
		return wugongshijian;
	}
	public void setWugongshijian(String wugongshijian) {
		this.wugongshijian = wugongshijian;
	}
	public String getHuzhu_id() {
		return huzhu_id;
	}
	public void setHuzhu_id(String huzhu_id) {
		this.huzhu_id = huzhu_id;
	}
	public String getWenhuachengdu() {
		return wenhuachengdu;
	}
	public void setWenhuachengdu(String wenhuachengdu) {
		this.wenhuachengdu = wenhuachengdu;
	}
	
	public String getYuhuzhuguanxi() {
		return yuhuzhuguanxi;
	}
	public void setYuhuzhuguanxi(String yuhuzhuguanxi) {
		this.yuhuzhuguanxi = yuhuzhuguanxi;
	}
	public String getXinxingnongcunhezuoyiliao() {
		return xinxingnongcunhezuoyiliao;
	}
	public void setXinxingnongcunhezuoyiliao(String xinxingnongcunhezuoyiliao) {
		this.xinxingnongcunhezuoyiliao = xinxingnongcunhezuoyiliao;
	}
	public String getZaixiaoshengzhuangkuang() {
		return zaixiaoshengzhuangkuang;
	}
	public void setZaixiaoshengzhuangkuang(String zaixiaoshengzhuangkuang) {
		this.zaixiaoshengzhuangkuang = zaixiaoshengzhuangkuang;
	}
	public String getChengxiangjuminyanglaobaoxian() {
		return chengxiangjuminyanglaobaoxian;
	}
	public void setChengxiangjuminyanglaobaoxian(String chengxiangjuminyanglaobaoxian) {
		this.chengxiangjuminyanglaobaoxian = chengxiangjuminyanglaobaoxian;
	}
	public String getLaodongnengli() {
		return laodongnengli;
	}
	public void setLaodongnengli(String laodongnengli) {
		this.laodongnengli = laodongnengli;
	}
	public String getCanjizhenghaoma() {
		return canjizhenghaoma;
	}
	public void setCanjizhenghaoma(String canjizhenghaoma) {
		this.canjizhenghaoma = canjizhenghaoma;
	}
	
	
	public Familybean(Long id,String name,String xingming, String wugongshijian, String huzhu_id, String wenhuachengdu,
			String yuhuzhuguanxi, String xinxingnongcunhezuoyiliao, String zaixiaoshengzhuangkuang,
			String chengxiangjuminyanglaobaoxian, String laodongnengli, String canjizhenghaoma,int category) {
		super();
		this.id = id;
		this.name = name;
		this.xingming = xingming;
		this.wugongshijian = wugongshijian;
		this.huzhu_id = huzhu_id;
		this.wenhuachengdu = wenhuachengdu;
		this.yuhuzhuguanxi = yuhuzhuguanxi;
		this.xinxingnongcunhezuoyiliao = xinxingnongcunhezuoyiliao;
		this.zaixiaoshengzhuangkuang = zaixiaoshengzhuangkuang;
		this.chengxiangjuminyanglaobaoxian = chengxiangjuminyanglaobaoxian;
		this.laodongnengli = laodongnengli;
		this.canjizhenghaoma = canjizhenghaoma;
		this.category = category;
		
	}
	public Familybean() {
	}
	
}
