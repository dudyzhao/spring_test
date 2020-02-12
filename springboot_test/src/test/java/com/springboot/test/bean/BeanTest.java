package com.springboot.test.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 15:31
 * description:
 **/
@SpringBootTest
@ComponentScan("com.springboot.test.bean")
public class BeanTest {
	@Autowired
	private BeanService beanService;
	@Test
	public void test(){
		System.out.println(beanService);
	}
}
