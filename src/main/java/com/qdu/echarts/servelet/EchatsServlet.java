package com.qdu.echarts.servelet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qdu.echarts.beans.Rels;
import com.qdu.echarts.entities.base.Persons;
import com.qdu.echarts.entities.base.Family;
import com.qdu.echarts.entities.relationships.HAS_FAMILY;
import com.qdu.echarts.repositories.NodeRepository;
import com.qdu.echarts.service.getdata;

/**
 * Servlet implementation class EchatsServlet
 */
public class EchatsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
     * @see HttpServlet#HttpServlet()
     */
    public EchatsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:/spring/dal-neo4j-context.xml");
//		 getdata a = (getdata) applicationContext.getBean("getdata");
//		 String result = new String();
//		 result = a.getrel();
//		 response.setContentType("text/html; charset=utf-8");
//	        response.getWriter().write(result);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * 必须通过ApplicationContext获取spring容器管理的bean，不能new，否则无法自动装配repository，返回null，空指针异常。
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:/spring/dal-neo4j-context.xml");
		 getdata a = (getdata) applicationContext.getBean("getdata");
		 String result = new String();
		 result = a.indexdata();
		 response.setContentType("text/html; charset=utf-8");
	        response.getWriter().write(result);  
	}

}
