package com.springboot.test.value;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-09 14:40
 * description:
 **/
@SpringBootTest
@ComponentScan("com.springboot.test.value")
public class ValueTest {
	@Autowired
	private ELConfiguration elConfiguration;
	@Test
	public void testConfiguration(){
		elConfiguration.outputResource();
	}
}
