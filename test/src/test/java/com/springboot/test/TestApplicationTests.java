package com.springboot.test;

import com.springboot.test.async.config.TaskExecutorConfig;
import com.springboot.test.async.service.AsyncTaskService;
import com.springboot.test.aware.AwareService;
import com.springboot.test.bean.BeanInit;
import com.springboot.test.event.DemoPublish;
import com.springboot.test.value.ELConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootTest
class TestApplicationTests {

	@Autowired
	private ELConfiguration elConfiguration;
	@Test
	public void testConfiguration(){
		elConfiguration.outputResource();
	}
	@Autowired
	private DemoPublish demoPublish;
	@Test
	public void testEvent(){
		demoPublish.publish("我是一个消息体");
	}
}
