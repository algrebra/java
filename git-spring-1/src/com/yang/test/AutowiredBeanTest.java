package com.yang.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.yang.config.BeanConfig;
import com.yang.model.Teacher;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BeanConfig.class)
public class AutowiredBeanTest {
	
	@Autowired
	private Teacher teacher ;
	
	
	
	
	@Test
	public void test(){
		System.out.println(teacher);
	}
	
	
	
	
}
