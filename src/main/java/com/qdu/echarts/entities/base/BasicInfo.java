package com.qdu.echarts.entities.base;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_BANGFUXIANGMU;
import com.qdu.echarts.entities.relationships.HAS_BANGFUREN;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;

@NodeEntity
public class BasicInfo  extends AbstractEntity {
	
	@Relationship(type="HAS_FAMILY", direction=Relationship.INCOMING)
	private Set<HAS_FAMILY> has_family;
	
	@Relationship(type="HAS_BANGFUXIANGMU", direction=Relationship.INCOMING)
	private Set<HAS_BANGFUXIANGMU> has_bangfuxiangmu;
	
	@Relationship(type="HAS_BANGFUREN", direction=Relationship.INCOMING)
	private Set<HAS_BANGFUREN> has_bangfuren;
	
	@Relationship(type="HAS_IMAGE", direction=Relationship.INCOMING)
	private Set<HAS_IMAGE> has_image;
	
	private String julicunzhuganlu_gongli;
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
	private String yinshuiqingkuang;
	private String shifoutongdian;
	private String jianfangshijian;
	private static int catetory = 1;
	

	
	
	public Set<HAS_FAMILY> getHas_family() {
		return has_family;
	}


	public void setHas_family(Set<HAS_FAMILY> has_family) {
		this.has_family = has_family;
	}


	public Set<HAS_BANGFUXIANGMU> getHas_bangfuxiangmu() {
		return has_bangfuxiangmu;
	}


	public void setHas_bangfuxiangmu(Set<HAS_BANGFUXIANGMU> has_bangfuxiangmu) {
		this.has_bangfuxiangmu = has_bangfuxiangmu;
	}


	public Set<HAS_BANGFUREN> getHas_bangfuren() {
		return has_bangfuren;
	}


	public void setHas_bangfuren(Set<HAS_BANGFUREN> has_bangfuren) {
		this.has_bangfuren = has_bangfuren;
	}


	public Set<HAS_IMAGE> getHas_image() {
		return has_image;
	}


	public void setHas_image(Set<HAS_IMAGE> has_image) {
		this.has_image = has_image;
	}


	public String getJulicunzhuganlu_gongli() {
		return julicunzhuganlu_gongli;
	}


	public void setJulicunzhuganlu_gongli(String julicunzhuganlu_gongli) {
		this.julicunzhuganlu_gongli = julicunzhuganlu_gongli;
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


	public String getYinshuiqingkuang() {
		return yinshuiqingkuang;
	}


	public void setYinshuiqingkuang(String yinshuiqingkuang) {
		this.yinshuiqingkuang = yinshuiqingkuang;
	}


	public String getShifoutongdian() {
		return shifoutongdian;
	}


	public void setShifoutongdian(String shifoutongdian) {
		this.shifoutongdian = shifoutongdian;
	}


	public String getJianfangshijian() {
		return jianfangshijian;
	}


	public void setJianfangshijian(String jianfangshijian) {
		this.jianfangshijian = jianfangshijian;
	}


	public static int getCatetory() {
		return catetory;
	}


	public static void setCatetory(int catetory) {
		BasicInfo.catetory = catetory;
	}


	public BasicInfo(String julicunzhuganlu_gongli, String jiatingzhuzhi, String lianxidianhua, String xiangguanjianjie,
			String zhufangmianji, String nonghushuxing, String zhufangjiegou, String huzhuxingming, String huma,
			String ranliaoleixing, String pinkunyuanyin, String juanzengxuqiuzonge_yuan, String jiatingrenshu,
			String jiatingnianrenjunshouru_yuan, String shoujuanjine_yuan, String yinshuiqingkuang,
			String shifoutongdian, String jianfangshijian) {
		super();
		this.julicunzhuganlu_gongli = julicunzhuganlu_gongli;
		this.jiatingzhuzhi = jiatingzhuzhi;
		this.lianxidianhua = lianxidianhua;
		this.xiangguanjianjie = xiangguanjianjie;
		this.zhufangmianji = zhufangmianji;
		this.nonghushuxing = nonghushuxing;
		this.zhufangjiegou = zhufangjiegou;
		this.huzhuxingming = huzhuxingming;
		this.huma = huma;
		this.ranliaoleixing = ranliaoleixing;
		this.pinkunyuanyin = pinkunyuanyin;
		this.juanzengxuqiuzonge_yuan = juanzengxuqiuzonge_yuan;
		this.jiatingrenshu = jiatingrenshu;
		this.jiatingnianrenjunshouru_yuan = jiatingnianrenjunshouru_yuan;
		this.shoujuanjine_yuan = shoujuanjine_yuan;
		this.yinshuiqingkuang = yinshuiqingkuang;
		this.shifoutongdian = shifoutongdian;
		this.jianfangshijian = jianfangshijian;
	}
	
	
	public BasicInfo(String jiatingzhuzhi, String lianxidianhua, String xiangguanjianjie, String zhufangmianji,
			String nonghushuxing, String huzhuxingming, String huma, String ranliaoleixing, String pinkunyuanyin,
			String juanzengxuqiuzonge_yuan, String jiatingrenshu, String jiatingnianrenjunshouru_yuan,
			String shoujuanjine_yuan) {
		super();
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
	}
	public BasicInfo() {
		// TODO Auto-generated constructor stub
	}
}
