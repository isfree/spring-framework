package com.may.xy.chap01.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * <p/>Project Name:spring
 * <p/>cretate user:mayxys
 * <p/>Date:2017/7/22 19:19
 * <p/>Copyright (c) 2017, All Rights Reserved.
 * <p/>TODO 说明类用途
 */
public class Bean1Test {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Bean1 bean1 = (Bean1) bf.getBean("bean1");
		bean1.sayHello();

	}
}
