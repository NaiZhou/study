package com.qdu.echarts.beans;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_GOVHELP;
import com.qdu.echarts.entities.relationships.HAS_HELPPERSON;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;


public class BasicInfobean  {
	private Long id;
	private String name;
	private String jiatingzhuzhi;
	private String lianxidianhua;
	private String xiangguanjianjie;
	private String zhufangmianji;
	private String nonghushuxing;
	private String zhufangjiegou;
	private String huzhuxingming;
	private String huma;
	private String ranliaoleixing;
	private String pinkunyuanyin;
	private String juanzengxuqiuzonge_yuan;
	private String jiatingrenshu;
	private String jiatingnianrenjunshouru_yuan;
	private String shoujuanjine_yuan;
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
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	public String getXiangguanjianjie() {
		return xiangguanjianjie;
	}
	public void setXiangguanjianjie(String xiangguanjianjie) {
		this.xiangguanjianjie = xiangguanjianjie;
	}
	public String getZhufangmianji() {
		return zhufangmianji;
	}
	public void setZhufangmianji(String zhufangmianji) {
		this.zhufangmianji = zhufangmianji;
	}
	public String getNonghushuxing() {
		return nonghushuxing;
	}
	public void setNonghushuxing(String nonghushuxing) {
		this.nonghushuxing = nonghushuxing;
	}
	public String getZhufangjiegou() {
		return zhufangjiegou;
	}
	public void setZhufangjiegou(String zhufangjiegou) {
		this.zhufangjiegou = zhufangjiegou;
	}
	public String getHuzhuxingming() {
		return huzhuxingming;
	}
	public void setHuzhuxingming(String huzhuxingming) {
		this.huzhuxingming = huzhuxingming;
	}
	public String getHuma() {
		return huma;
	}
	public void setHuma(String huma) {
		this.huma = huma;
	}
	public String getRanliaoleixing() {
		return ranliaoleixing;
	}
	public void setRanliaoleixing(String ranliaoleixing) {
		this.ranliaoleixing = ranliaoleixing;
	}
	public String getPinkunyuanyin() {
		return pinkunyuanyin;
	}
	public void setPinkunyuanyin(String pinkunyuanyin) {
		this.pinkunyuanyin = pinkunyuanyin;
	}
	public String getJuanzengxuqiuzonge_yuan() {
		return juanzengxuqiuzonge_yuan;
	}
	public void setJuanzengxuqiuzonge_yuan(String juanzengxuqiuzonge_yuan) {
		this.juanzengxuqiuzonge_yuan = juanzengxuqiuzonge_yuan;
	}
	public String getJiatingrenshu() {
		return jiatingrenshu;
	}
	public void setJiatingrenshu(String jiatingrenshu) {
		this.jiatingrenshu = jiatingrenshu;
	}
	public String getJiatingnianrenjunshouru_yuan() {
		return jiatingnianrenjunshouru_yuan;
	}
	public void setJiatingnianrenjunshouru_yuan(String jiatingnianrenjunshouru_yuan) {
		this.jiatingnianrenjunshouru_yuan = jiatingnianrenjunshouru_yuan;
	}
	public String getShoujuanjine_yuan() {
		return shoujuanjine_yuan;
	}
	public void setShoujuanjine_yuan(String shoujuanjine_yuan) {
		this.shoujuanjine_yuan = shoujuanjine_yuan;
	}
	
	
	
	public BasicInfobean(Long id,String name,String jiatingzhuzhi, String lianxidianhua, String xiangguanjianjie, String zhufangmianji,
			String nonghushuxing, String huzhuxingming, String huma, String ranliaoleixing, String pinkunyuanyin,
			String juanzengxuqiuzonge_yuan, String jiatingrenshu, String jiatingnianrenjunshouru_yuan,
			String shoujuanjine_yuan,int category) {
		super();
		this.id = id;
		this.name=name;
		this.jiatingzhuzhi = jiatingzhuzhi;
		this.lianxidianhua = lianxidianhua;
		this.xiangguanjianjie = xiangguanjianjie;
		this.zhufangmianji = zhufangmianji;
		this.nonghushuxing = nonghushuxing;
		this.huzhuxingming = huzhuxingming;
		this.huma = huma;
		this.ranliaoleixing = ranliaoleixing;
		this.pinkunyuanyin = pinkunyuanyin;
		this.juanzengxuqiuzonge_yuan = juanzengxuqiuzonge_yuan;
		this.jiatingrenshu = jiatingrenshu;
		this.jiatingnianrenjunshouru_yuan = jiatingnianrenjunshouru_yuan;
		this.shoujuanjine_yuan = shoujuanjine_yuan;
		this.category = category;
	}
	public BasicInfobean() {
		// TODO Auto-generated constructor stub
	}
}
