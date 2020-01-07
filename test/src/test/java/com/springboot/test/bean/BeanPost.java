package com.springboot.test.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-06 18:12
 * description:
 **/
public class BeanPost {
	@PostConstruct
	public void init(){
		System.out.println("构造之前执行。。。。。");
	}

	@PreDestroy
	public void destory(){
		System.out.println("销毁之前执行。。。。。");
	}
}
