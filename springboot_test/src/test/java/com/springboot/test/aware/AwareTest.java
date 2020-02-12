package com.springboot.test.aware;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 15:30
 * description:
 **/
@SpringBootTest
@ComponentScan("com.springboot.test.aware")
public class AwareTest {
	@Autowired
	private AwareService awareService;

	@Test
	public void testAware(){
		awareService.outputResult();
	}
}
