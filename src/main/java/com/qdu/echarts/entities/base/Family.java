package com.qdu.echarts.entities.base;

import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_BANGFUXIANGMU;
import com.qdu.echarts.entities.relationships.HAS_BANGFUREN;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;

/**
 * 数据包含name和info，不能写ID，ID属性echarts无法读取，无法通过ID连接节点关系
 */
@NodeEntity
public class Family extends AbstractEntity{
	
	@Relationship(type="HAS_FAMILY", direction=Relationship.INCOMING)
	private Set<HAS_FAMILY> has_family;
	
	@Relationship(type="HAS_BANGFUXIANGMU", direction=Relationship.INCOMING)
	private Set<HAS_BANGFUXIANGMU> has_govhelp;
	
	@Relationship(type="HAS_BANGFUREN", direction=Relationship.INCOMING)
	private Set<HAS_BANGFUREN> has_helpperson;
	
	@Relationship(type="HAS_IMAGE", direction=Relationship.INCOMING)
	private Set<HAS_IMAGE> has_image;
	
	private String xingming;
	private String huzhu_id;
	private String wugongshijian;
	private String wenhuachengdu;
	private String yuhuzhuguanxi;
	private String chushengnianyue;
	private String xinxingnongcunhezuoyiliao;
	private String zaixiaoshengzhuangkuang;
	private String chengxiangjuminyanglaobaoxian;
	private String laodongnengli;
	private String canjizhenghaoma;
	private static int catetory = 2;	
	
	
	
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
		Family.catetory = catetory;
	}
	public String getName() {
		return xingming;
	}
	public void setName(String name) {
		this.xingming = name;
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
	public String getChushengnianyue() {
		return chushengnianyue;
	}
	public void setChushengnianyue(String chushengnianyue) {
		this.chushengnianyue = chushengnianyue;
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
	
	public Family(String xingming, String wugongshijian, String huzhu_id, String wenhuachengdu, String chushengnianyue,
			String yuhuzhuguanxi, String xinxingnongcunhezuoyiliao, String zaixiaoshengzhuangkuang,
			String chengxiangjuminyanglaobaoxian, String laodongnengli, String canjizhenghaoma) {
		super();
		this.xingming = xingming;
		this.wugongshijian = wugongshijian;
		this.huzhu_id = huzhu_id;
		this.wenhuachengdu = wenhuachengdu;
		this.chushengnianyue = chushengnianyue;
		this.yuhuzhuguanxi = yuhuzhuguanxi;
		this.xinxingnongcunhezuoyiliao = xinxingnongcunhezuoyiliao;
		this.zaixiaoshengzhuangkuang = zaixiaoshengzhuangkuang;
		this.chengxiangjuminyanglaobaoxian = chengxiangjuminyanglaobaoxian;
		this.laodongnengli = laodongnengli;
		this.canjizhenghaoma = canjizhenghaoma;
	}
	public Family() {
	}
	
}
