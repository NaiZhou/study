package com.qdu.echarts.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qdu.echarts.beans.BasicInfobean;
import com.qdu.echarts.beans.Familybean;
import com.qdu.echarts.beans.GovHelpbean;
import com.qdu.echarts.beans.HelpPersonbean;
import com.qdu.echarts.beans.Imagebean;
import com.qdu.echarts.beans.Rels;
import com.qdu.echarts.entities.base.Persons;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.Family;
import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_GOVHELP;
import com.qdu.echarts.entities.relationships.HAS_HELPPERSON;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;
import com.qdu.echarts.repositories.NodeRepository;

@Component
@Transactional
public class getSearchData {

	@Autowired
	private NodeRepository nodeRepository;
	
	public String getdata(String name) {
		List<BasicInfobean> basicInfo = new ArrayList<BasicInfobean>();
		List<Familybean> familybean = new ArrayList<Familybean>();
		List<GovHelpbean> govhelpbean = new ArrayList<GovHelpbean>();
		List<HelpPersonbean> helpperson = new ArrayList<HelpPersonbean>();
		List<Imagebean> image = new ArrayList<Imagebean>();
		
		List<Rels> rs = new ArrayList<Rels>();
		
		BasicInfo basinfo = new BasicInfo();
		
		Iterable<BasicInfo> it = nodeRepository.findByName(name);
		Iterator<BasicInfo> iter = it.iterator();
		Set<HAS_GOVHELP> has_govhelp = new HashSet<HAS_GOVHELP>();
		Set<HAS_IMAGE> has_image = new HashSet<HAS_IMAGE>();
		Set<HAS_HELPPERSON> has_helpperson = new HashSet<HAS_HELPPERSON>();
		Set<HAS_FAMILY> has_family = new HashSet<HAS_FAMILY>();
		
		while(iter.hasNext()) {
			basinfo = iter.next();
			
			basicInfo.add(new BasicInfobean(basinfo.getId(),basinfo.getHuzhuxingming(),basinfo.getJiatingzhuzhi(), basinfo.getLianxidianhua(),
					basinfo.getXiangguanjianjie(), basinfo.getZhufangmianji(), basinfo.getNonghushuxing(),
					basinfo.getHuzhuxingming(), basinfo.getHuma(), basinfo.getRanliaoleixing(),
					basinfo.getPinkunyuanyin(), basinfo.getJuanzengxuqiuzonge_yuan(), basinfo.getJiatingrenshu(),
					basinfo.getJiatingnianrenjunshouru_yuan(), basinfo.getShoujuanjine_yuan(),1));
			
			
			has_govhelp = basinfo.getHas_govhelp();
			has_image = basinfo.getHas_image();
			has_family = basinfo.getHas_family();
			has_helpperson = basinfo.getHas_helpperson();
			System.out.println("----------------------");
//			try {
//				for (HAS_HELPPERSON has : has_helpperson) {
//					rs.add(new Rels(has.getStartnode().getHuzhuxingming(), has.getEndnode().getBangfurenxingming(),
//							new String("帮扶人")));
//					helpperson.add(new HelpPersonbean(
//							has.getEndnode().getHuzhu_id(), has.getEndnode().getBangfukaishishijian(),
//							has.getEndnode().getLianxidianhua(), has.getEndnode().getDanweilishuguanxi(),
//							has.getEndnode().getBangfujieshushijian(), has.getEndnode().getBangfudanweimingcheng(),
//							has.getEndnode().getBangfurenxingming(), has.getEndnode().getCatetory()));
//				}
//			} catch (NullPointerException e) {
//				System.out.println("没有帮扶人关系");
//			}
//			
//			try {
//				for (HAS_FAMILY has : has_family) {
//					rs.add(new Rels(has.getStartnode().getHuzhuxingming(), has.getEndnode().getXingming(),
//							new String("家庭成员")));
//					familybean.add(new Familybean( has.getEndnode().getXingming(),
//							has.getEndnode().getWugongshijian(), has.getEndnode().getHuzhu_id(),
//							has.getEndnode().getWenhuachengdu(), has.getEndnode().getYuhuzhuguanxi(),
//							has.getEndnode().getXinxingnongcunhezuoyiliao(),
//							has.getEndnode().getZaixiaoshengzhuangkuang(),
//							has.getEndnode().getChengxiangjuminyanglaobaoxian(), has.getEndnode().getLaodongnengli(),
//							has.getEndnode().getCanjizhenghaoma(), has.getEndnode().getCatetory()));
//				}
//			} catch (NullPointerException e) {
//				System.out.println("没有家庭成员关系");
//			}
//			try {
//				for (HAS_GOVHELP has : has_govhelp) {
//					rs.add(new Rels(has.getStartnode().getHuzhuxingming(), has.getEndnode().getXiangmumingcheng(),
//							new String("帮扶项目")));
//					govhelpbean.add(new GovHelpbean(
//							has.getEndnode().getXiangmumingcheng(), has.getEndnode().getHuzhu_id(),
//							has.getEndnode().getFuchinianfen(), has.getEndnode().getXiangmuleibie(),
//							has.getEndnode().getZijinzonge_yuan(), has.getEndnode().getJiansheneirong(),
//							has.getEndnode().getCatetory()));
//				}
//			} catch (NullPointerException e) {
//				System.out.println("没有帮扶项目关系");
//			}
//
//			try {
//				for (HAS_IMAGE has : has_image) {
//					rs.add(new Rels(has.getStartnode().getHuzhuxingming(), has.getEndnode().getHuzhu_id(),
//							new String("图片")));
//					image.add(new Imagebean(has.getEndnode().getUrl()));
//				}
//			} catch (NullPointerException e) {
//				System.out.println("没有图片关系");
//			}
			try {
				for (HAS_HELPPERSON has : has_helpperson) {
					rs.add(new Rels(has.getStartnode().getId(), has.getEndnode().getId(),
							new String("帮扶人")));
					helpperson.add(new HelpPersonbean(has.getEndnode().getId(),has.getEndnode().getBangfurenxingming(),
							has.getEndnode().getHuzhu_id(), has.getEndnode().getBangfukaishishijian(),
							has.getEndnode().getLianxidianhua(), has.getEndnode().getDanweilishuguanxi(),
							has.getEndnode().getBangfujieshushijian(), has.getEndnode().getBangfudanweimingcheng(),
							has.getEndnode().getBangfurenxingming(), 2));
				}
			} catch (NullPointerException e) {
				System.out.println("没有帮扶人关系");
			}
			
			try {
				for (HAS_FAMILY has : has_family) {
					rs.add(new Rels(has.getStartnode().getId(), has.getEndnode().getId(),
							new String("家庭成员")));
					familybean.add(new Familybean(has.getEndnode().getId(), has.getEndnode().getXingming(),has.getEndnode().getXingming(),
							has.getEndnode().getWugongshijian(), has.getEndnode().getHuzhu_id(),
							has.getEndnode().getWenhuachengdu(), has.getEndnode().getYuhuzhuguanxi(),
							has.getEndnode().getXinxingnongcunhezuoyiliao(),
							has.getEndnode().getZaixiaoshengzhuangkuang(),
							has.getEndnode().getChengxiangjuminyanglaobaoxian(), has.getEndnode().getLaodongnengli(),
							has.getEndnode().getCanjizhenghaoma(),3));
				}
			} catch (NullPointerException e) {
				System.out.println("没有家庭成员关系");
			}
			try {
				for (HAS_GOVHELP has : has_govhelp) {
					rs.add(new Rels(has.getStartnode().getId(), has.getEndnode().getId(),
							new String("帮扶项目")));
					govhelpbean.add(new GovHelpbean(has.getEndnode().getId(),has.getEndnode().getXiangmumingcheng(),
							has.getEndnode().getXiangmumingcheng(), has.getEndnode().getHuzhu_id(),
							has.getEndnode().getFuchinianfen(), has.getEndnode().getXiangmuleibie(),
							has.getEndnode().getZijinzonge_yuan(), has.getEndnode().getJiansheneirong(),
							4));
				}
			} catch (NullPointerException e) {
				System.out.println("没有帮扶项目关系");
			}
			
			try {
				int i = 1;
				for (HAS_IMAGE has : has_image) {
					rs.add(new Rels(has.getStartnode().getId(), has.getEndnode().getId(),
							new String("图片")));
					image.add(new Imagebean(has.getEndnode().getId(),"图片",has.getEndnode().getUrl(),5));
				}
			} catch (NullPointerException e) {
				System.out.println("没有图片关系");
			}
			System.out.println("----------------------");
		}
		String json = new String();
		ObjectMapper mapper = new ObjectMapper(); // 提供java-json相互转换功能的类
		String basicinfonode = new String();
		String familynode = new String();
		String govhelpnode = new String();
		String imagenode = new String();
		String helppersonnode = new String();
		try {
			basicinfonode = mapper.writeValueAsString(basicInfo);
			familynode = mapper.writeValueAsString(familybean);
			govhelpnode = mapper.writeValueAsString(govhelpbean);
			imagenode = mapper.writeValueAsString(image);
			helppersonnode = mapper.writeValueAsString(helpperson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 将list中的对象转换为Json格式的数组
//		System.out.println(basicinfonode);
//		System.out.println(familynode);
//		System.out.println(govhelpnode);
//		System.out.println(imagenode);
//		System.out.println(helppersonnode);
		
		
		StringBuffer   relationship=new StringBuffer("["); 
		for (Rels r : rs) { 
         	relationship.append("{ source:" + "\""+r.getSource()+"\""+",");
         	relationship.append("target:" + "\""+r.getTarget()+"\""+",");
         	relationship.append("value:" + "\""+ r.getValue()+"\""+"},");
		}
		relationship.append("]");
		
//		json = basicinfonode+"-"+familynode+"-"+govhelpnode+"-"+imagenode+"-"+helppersonnode+"-"+relationship;
		json =basicinfonode.substring(0,basicinfonode.length()-1)+","+familynode.substring(1,familynode.length()-1)+","+govhelpnode.substring(1,govhelpnode.length()-1)+","+helppersonnode.substring(1,helppersonnode.length()-1)+","+imagenode.substring(1)+"-"+relationship;
		
		return json;
	}
}
