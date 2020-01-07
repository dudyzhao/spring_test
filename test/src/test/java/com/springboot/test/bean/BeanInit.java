package com.springboot.test.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-06 18:08
 * description:
 **/
@Configuration
public class BeanInit {

	@Bean(initMethod = "init",destroyMethod = "destory")
	public BeanService beanService(){
		return new BeanService();
	}

	@Bean
	public BeanPost beanPost(){
		return new BeanPost();
	}
}
