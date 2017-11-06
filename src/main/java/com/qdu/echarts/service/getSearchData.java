package com.qdu.echarts.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qdu.echarts.beans.Rels;
import com.qdu.echarts.entities.base.Persons;
import com.qdu.echarts.entities.base.Family;
import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.repositories.NodeRepository;

@Component
@Transactional
public class getSearchData {

	@Autowired
	private NodeRepository personsRepository;
	
	public String getdata(String name) {
		return name;
//
//		List<Resident> ps = new ArrayList<Resident>();
//        List<Rels> rs = new ArrayList<Rels>();
//		
//		Persons per = new Persons();
////		System.out.println(personsRepository.findAll());
//		Iterable<Persons> pers =personsRepository.findPersonsByName(name);
//		Iterator iter = pers.iterator();
//		while (iter.hasNext()) {
//			Object s = iter.next();
//			try {
//				per = (Persons) s;
//				Resident pers1= new Resident(per.getName(),per.getInfo(),per.getTel(),per.getAdd(),per.getRemark(),per.getDate());
//				ps.add(pers1);
////				System.out.println(per.getName());
////				System.out.println(per.getInfo());
//				Method m2 = s.getClass().getMethod("getRel");
//				Set a = (Set) m2.invoke(s);
//				  for (Object object : a) { 
//					  	HELPED_BY r = new HELPED_BY();
//			             r = (HELPED_BY) object;
//			             Rels rels1 = new Rels(r.getStartperson().getName(),r.getEndperson().getName(),r.getname());
//			             rs.add(rels1);
////			             System.out.println("startperson:"+r.getStartperson().getName());
////			             System.out.println("endperson:"+r.getEndperson().getName());
////			             System.out.println("relname:"+r.getname());
////			             System.out.println();
//			        }
//			} catch (NoSuchMethodException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}  catch (NullPointerException e) {
//				System.out.println("û�й�ϵ");
//			}catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InvocationTargetException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//			String json = new String();
//		 ObjectMapper mapper = new ObjectMapper();    //�ṩjava-json�໥ת�����ܵ���
//	        String persons=new String();
//			try {
//				persons = mapper.writeValueAsString(ps);
//				
//			} catch (JsonProcessingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}    //��list�еĶ���ת��ΪJson��ʽ������
//	        
//			
//			System.out.println(persons);
//			System.out.println();
//			
//			//����ϵ����ת��Ϊjson����
//			StringBuffer   relationship=new StringBuffer("-["); 
//			for (Object object : rs) { 
//			  	Rels r = new Rels();
//	             r = (Rels) object;
//	         	relationship.append("{ source:" + "\""+r.getSource()+"\""+",");
//	         	relationship.append("target:" + "\""+r.getTarget()+"\""+",");
//	         	relationship.append("value:" + "\""+ r.getValue()+"\""+"},");
//			}
//			relationship.append("]");
//			
//			
//			System.out.println(relationship);
//			
//			
//			//ajaxֻ����һ���ַ�������Ҫ��js�ļ��н��������ݷֿ���ͨ����-������Ϊperson��relationship����
//			json = persons + relationship;
////			String[] sArray=json.split("-");
////			System.out.println(sArray[0]);
//		
//			return json;
//	}
//	
//	public String getdata(String startname,String endname) {
//
//		List<Resident> ps = new ArrayList<Resident>();
//        List<Rels> rs = new ArrayList<Rels>();
//		
//		Persons per = new Persons();
////		System.out.println(personsRepository.findAll());
//		Iterable<Persons> pers =personsRepository.findRelByName(startname,endname);
//		Iterator iter = pers.iterator();
//		while (iter.hasNext()) {
//			Object s = iter.next();
//			try {
//				per = (Persons) s;
//				Resident pers1= new Resident(per.getName(),per.getInfo(),per.getTel(),per.getAdd(),per.getRemark(),per.getDate());
//				ps.add(pers1);
////				System.out.println(per.getName());
////				System.out.println(per.getInfo());
//				//Method m2 = s.getClass().getMethod("getRel");
//				//Set a = (Set) m2.invoke(s);
//				Set a = (Set) per.getRel();
//				  for (Object object : a) { 
//					  	HELPED_BY r = new HELPED_BY();
//			             r = (HELPED_BY) object;
//			             Rels rels1 = new Rels(r.getStartperson().getName(),r.getEndperson().getName(),r.getname());
//			             rs.add(rels1);
////			             System.out.println("startperson:"+r.getStartperson().getName());
////			             System.out.println("endperson:"+r.getEndperson().getName());
////			             System.out.println("relname:"+r.getname());
////			             System.out.println();
//			        }
//			
//			}  catch (NullPointerException e) {
//				System.out.println("û�й�ϵ");
//			}
//			catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
//		}
//			String json = new String();
//			ObjectMapper mapper = new ObjectMapper();    //�ṩjava-json�໥ת�����ܵ���
//	        String persons=new String();
//			try {
//				persons = mapper.writeValueAsString(ps);
//				
//			} catch (JsonProcessingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}    //��list�еĶ���ת��ΪJson��ʽ������
//	        
//			
//			System.out.println(persons);
//			System.out.println();
//			
//			//����ϵ����ת��Ϊjson����
//			StringBuffer   relationship=new StringBuffer("-["); 
//			for (Object object : rs) { 
//			  	Rels r = new Rels();
//	             r = (Rels) object;
//	         	relationship.append("{ source:" + "\""+r.getSource()+"\""+",");
//	         	relationship.append("target:" + "\""+r.getTarget()+"\""+",");
//	         	relationship.append("value:" + "\""+ r.getValue()+"\""+"},");
//			}
//			relationship.append("]");
//			
//			
//			System.out.println(relationship);
//			
//			
//			//ajaxֻ����һ���ַ�������Ҫ��js�ļ��н��������ݷֿ���ͨ����-������Ϊperson��relationship����
//			json = persons + relationship;
////			String[] sArray=json.split("-");
////			System.out.println(sArray[0]);
//		
//			return json;
	}
}
