package com.springboot.test.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-09 14:39
 * description:
 **/
@SpringBootTest
@ComponentScan("com.springboot.test.event")
public class EventTest {
	@Autowired
	private DemoPublish demoPublish;
	@Test
	public void testEvent(){
		demoPublish.publish("我是一个消息体");
	}
}
