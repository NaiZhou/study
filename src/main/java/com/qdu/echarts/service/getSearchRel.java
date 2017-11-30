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
import com.qdu.echarts.beans.BangFuXiangMuBean;
import com.qdu.echarts.beans.BangFuRenBean;
import com.qdu.echarts.beans.Imagebean;
import com.qdu.echarts.beans.Rels;
import com.qdu.echarts.beans.RelsBangFuRen;
import com.qdu.echarts.beans.RelsBangFuXiangMu;
import com.qdu.echarts.entities.base.Persons;
import com.qdu.echarts.entities.base.BasicInfo;
import com.qdu.echarts.entities.base.Family;
import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.entities.relationships.HAS_BANGFUXIANGMU;
import com.qdu.echarts.entities.relationships.HAS_BANGFUREN;
import com.qdu.echarts.entities.relationships.HAS_IMAGE;
import com.qdu.echarts.repositories.NodeRepository;

@Component
@Transactional
public class getSearchRel {

	@Autowired
	private NodeRepository nodeRepository;
	
	public String getdata(String name1,String name2) {
		Set<BasicInfobean> basicInfo = new HashSet<BasicInfobean>();
		Set<Familybean> familybean = new HashSet<Familybean>();
		Set<BangFuXiangMuBean> bangfuxiangmu = new HashSet<BangFuXiangMuBean>();
		Set<BangFuRenBean> bangfuren = new HashSet<BangFuRenBean>();
		Set<Imagebean> image = new HashSet<Imagebean>();
		Set rs = new HashSet();
		Iterable<Object> it = nodeRepository.findRelByName(name1,name2);
		Iterator<Object> iter = it.iterator();
		Set<HAS_BANGFUXIANGMU> has_bangfuxiangmu = new HashSet<HAS_BANGFUXIANGMU>();
		Set<HAS_IMAGE> has_image = new HashSet<HAS_IMAGE>();
		Set<HAS_BANGFUREN> has_bangfuren = new HashSet<HAS_BANGFUREN>();
		Set<HAS_FAMILY> has_family = new HashSet<HAS_FAMILY>();
		
		while(iter.hasNext()) {
			Object obj = iter.next();
			if("com.qdu.echarts.entities.base.BasicInfo".equals(obj.getClass().getName())) {
			BasicInfo basinfo = (BasicInfo)obj;
			basicInfo.add(new BasicInfobean(basinfo.getId(),basinfo.getHuzhuxingming(),basinfo.getJiatingzhuzhi(), basinfo.getLianxidianhua(),
					basinfo.getXiangguanjianjie(), basinfo.getZhufangmianji(), basinfo.getNonghushuxing(),
					basinfo.getHuzhuxingming(), basinfo.getHuma(), basinfo.getRanliaoleixing(),
					basinfo.getPinkunyuanyin(), basinfo.getJuanzengxuqiuzonge_yuan(), basinfo.getJiatingrenshu(),
					basinfo.getJiatingnianrenjunshouru_yuan(), basinfo.getShoujuanjine_yuan(),1));
			has_bangfuxiangmu = basinfo.getHas_bangfuxiangmu();
			has_image = basinfo.getHas_image();
			has_family = basinfo.getHas_family();
			has_bangfuren = basinfo.getHas_bangfuren();
			try {
				for (HAS_BANGFUREN has : has_bangfuren) {
					rs.add(new RelsBangFuRen(has.getStartnode().getId(), has.getEndnode().getId(),
							new String("帮扶人"),has.getBangfukaishishijian()));
					bangfuren.add(new BangFuRenBean(has.getStartnode().getId(),has.getStartnode().getBangfurenxingming(),
							has.getStartnode().getBangfurenxingming(), 2));
				}
			} catch (NullPointerException e) {
				System.out.println("没有帮扶人关系");
			}
			
			try {
				for (HAS_FAMILY has : has_family) {
					rs.add(new Rels(has.getStartnode().getId(), has.getEndnode().getId(),
							has.getRelation()));
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
				for (HAS_BANGFUXIANGMU has : has_bangfuxiangmu) {
					rs.add(new RelsBangFuXiangMu(has.getStartnode().getId(), has.getEndnode().getId(),
							new String("帮扶项目"),has.getFuchinianfen(),has.getJiansheneirong()));
					bangfuxiangmu.add(new BangFuXiangMuBean(has.getStartnode().getId(),has.getStartnode().getXiangmumingcheng(),has.getStartnode().getXiangmumingcheng(),4));
				}
			} catch (NullPointerException e) {
				System.out.println("没有帮扶项目关系");
			}
			
			try {
				for (HAS_IMAGE has : has_image) {
					rs.add(new Rels(has.getStartnode().getId(),has.getEndnode().getId(),new String("图片")));
					image.add(new Imagebean(has.getEndnode().getId(),"图片",has.getEndnode().getUrl(),5));
				}
			} catch (NullPointerException e) {
				System.out.println("没有图片关系");
			}
			}
		}
		String json = new String();
		ObjectMapper mapper = new ObjectMapper(); // 提供java-json相互转换功能的类
		String basicinfonode = new String();
		String familynode = new String();
		String bangfuxiangmunode = new String();
		String imagenode = new String();
		String bangfurennode = new String();
		try {
			basicinfonode = mapper.writeValueAsString(basicInfo);
			familynode = mapper.writeValueAsString(familybean);
			bangfuxiangmunode = mapper.writeValueAsString(bangfuxiangmu);
			imagenode = mapper.writeValueAsString(image);
			bangfurennode = mapper.writeValueAsString(bangfuren);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 将list中的对象转换为Json格式的数组
//		System.out.println(basicinfonode);
//		System.out.println(familynode);
//		System.out.println(bangfuxiangmunode);
//		System.out.println(imagenode);
//		System.out.println(bangfurennode);
		
		
		StringBuffer   relationship=new StringBuffer("["); 
		for(Object ra : rs) {
			Rels r = (Rels)ra;
			relationship.append("{ source:" + "\""+r.getSource()+"\""+",");
			relationship.append("target:" + "\""+r.getTarget()+"\""+",");
			relationship.append("value:" + "\""+ r.getValue()+"\""+"},");
		}
		relationship.append("]");
		json =basicinfonode.substring(0,basicinfonode.length()-1)+","+familynode.substring(1,familynode.length()-1)+","+bangfuxiangmunode.substring(1,bangfuxiangmunode.length()-1)+","+bangfurennode.substring(1,bangfurennode.length()-1)+","+imagenode.substring(1)+"-"+relationship;
		do {
		   json = json.replaceAll(",,", ",");
		} while(json.indexOf(",,") >= 0);
		return json;
	}
}
