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
import org.springframework.test.context.ContextConfiguration;
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
public class getdata {
	public static void main(String[] args) {
		
	}
	@Autowired
	private NodeRepository nodeRepository;

	public String getrel() {
		return null;

		// List<Resident> ps = new ArrayList<Resident>();
		// List<Rels> rs = new ArrayList<Rels>();
		//
		// Persons per = new Persons();
		//// System.out.println(personsRepository.findAll());
		// Iterable<Persons> pers = personsRepository.findAll();//��ȡ���ݿ�ȫ�����ݣ����Persons
		// Iterator iter = pers.iterator();
		// while (iter.hasNext()) {
		// Object s = iter.next();
		// try {
		// per = (Persons) s;
		//// Resident pers1= new
		// Resident(per.getName(),per.getInfo(),per.getTel(),per.getAdd(),per.getRemark(),per.getDate());
		// ps.add(pers1);//����list
		//// System.out.println(per.getName());
		//// System.out.println(per.getInfo());
		// Method m2 = s.getClass().getMethod("getRel");//ͨ������ʹ��getRel����
		// Set a = (Set) m2.invoke(s);
		// for (Object object : a) { //ʹ��ѭ������ϵ���ݴ���list��
		// HELPED_BY r = new HELPED_BY();
		// r = (HELPED_BY) object;
		//// Rels rels1 = new
		// Rels(r.getStartperson().getName(),r.getEndperson().getName(),r.getname());
		// rs.add(rels1);
		//// System.out.println("startperson:"+r.getStartperson().getName());
		//// System.out.println("endperson:"+r.getEndperson().getName());
		//// System.out.println("relname:"+r.getname());
		//// System.out.println();
		// }
		// } catch (NoSuchMethodException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (NullPointerException e) {
		// System.out.println("û�й�ϵ");
		// }catch (IllegalAccessException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IllegalArgumentException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (InvocationTargetException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// }
		// String json = new String();
		// ObjectMapper mapper = new ObjectMapper(); //�ṩjava-json�໥ת�����ܵ���
		// String persons=new String();
		// try {
		// persons = mapper.writeValueAsString(ps);
		//
		// } catch (JsonProcessingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } //��list�еĶ���ת��ΪJson��ʽ������
		//
		//
		// System.out.println(persons);
		// System.out.println();
		//
		// //����ϵ����ת��Ϊjson���ݣ�ʹ��StringBuffer���Ч�ʡ�����json��ʽǰ��'-'�Ա�ajax��ȡ�ַ�����ֿ�Ϊ����json
		// StringBuffer relationship=new StringBuffer("-[");
		// for (Object object : rs) {
		// Rels r = new Rels();
		// r = (Rels) object;
		// relationship.append("{ source:" + "\""+r.getSource()+"\""+",");
		// relationship.append("target:" + "\""+r.getTarget()+"\""+",");
		// relationship.append("value:" + "\""+ r.getValue()+"\""+"},");
		// }
		// relationship.append("]");
		//
		//
		// System.out.println(relationship);
		//
		//
		// //ajaxֻ����һ���ַ�������Ҫ��js�ļ��н��������ݷֿ���ͨ����-������Ϊperson��relationship����
		// json = persons + relationship;
		//// String[] sArray=json.split("-");
		//// System.out.println(sArray[0]);
		//
		// return json;

	}

	public String indexdata() {
		return this.BasicInfonode();
	}

	public String BasicInfonode() {
		Set<BasicInfobean> basicInfo = new HashSet<BasicInfobean>();
		Set<Familybean> familybean = new HashSet<Familybean>();
		Set<BangFuXiangMuBean> bangfuxiangmu = new HashSet<BangFuXiangMuBean>();
		Set<BangFuRenBean> bangfuren = new HashSet<BangFuRenBean>();
		Set<Imagebean> image = new HashSet<Imagebean>();
		
		Set rs = new HashSet();
		
		BasicInfo basinfo = new BasicInfo();
		
		Iterable<BasicInfo> it = nodeRepository.findoneBasicInfo();
		
		Iterator<BasicInfo> iter = it.iterator();
		Set<HAS_BANGFUXIANGMU> has_bangfuxiangmu = new HashSet<HAS_BANGFUXIANGMU>();
		Set<HAS_IMAGE> has_image = new HashSet<HAS_IMAGE>();
		Set<HAS_BANGFUREN> has_bangfuren = new HashSet<HAS_BANGFUREN>();
		Set<HAS_FAMILY> has_family = new HashSet<HAS_FAMILY>();
		
		while(iter.hasNext()) {
			basinfo = iter.next();
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
							new String("�����"),has.getBangfukaishishijian()));
					bangfuren.add(new BangFuRenBean(has.getStartnode().getId(),has.getStartnode().getBangfurenxingming(),
							has.getStartnode().getBangfurenxingming(), 2));
				}
			} catch (NullPointerException e) {
				System.out.println("û�а���˹�ϵ");
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
				System.out.println("û�м�ͥ��Ա��ϵ");
			}
			try {
				for (HAS_BANGFUXIANGMU has : has_bangfuxiangmu) {
					rs.add(new RelsBangFuXiangMu(has.getStartnode().getId(), has.getEndnode().getId(),
							new String("�����Ŀ"),has.getFuchinianfen(),has.getJiansheneirong()));
					bangfuxiangmu.add(new BangFuXiangMuBean(has.getStartnode().getId(),has.getStartnode().getXiangmumingcheng(),has.getStartnode().getXiangmumingcheng(),4));
				}
			} catch (NullPointerException e) {
				System.out.println("û�а����Ŀ��ϵ");
			}
			
			try {
				for (HAS_IMAGE has : has_image) {
					rs.add(new Rels(has.getStartnode().getId(),has.getEndnode().getId(),new String("ͼƬ")));
					image.add(new Imagebean(has.getEndnode().getId(),"ͼƬ",has.getEndnode().getUrl(),5));
				}
			} catch (NullPointerException e) {
				System.out.println("û��ͼƬ��ϵ");
			}
		}
		String json = new String();
		ObjectMapper mapper = new ObjectMapper(); // �ṩjava-json�໥ת�����ܵ���
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
		} // ��list�еĶ���ת��ΪJson��ʽ������
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
		
		System.out.println(relationship);
		json =basicinfonode.substring(0,basicinfonode.length()-1)+","+familynode.substring(1,familynode.length()-1)+","+bangfuxiangmunode.substring(1,bangfuxiangmunode.length()-1)+","+bangfurennode.substring(1,bangfurennode.length()-1)+","+imagenode.substring(1)+"-"+relationship;
//		System.out.println(json);
//		json = basicinfonode+"-"+familynode+"-"+bangfuxiangmunode+"-"+imagenode+"-"+bangfurennode+"-"+relationship;
//		String [] a = json.split("-");
//		System.out.println(a.length);
//		for(String b : a) {
//			System.out.println(b);
//		}
		return json;
	}
}
