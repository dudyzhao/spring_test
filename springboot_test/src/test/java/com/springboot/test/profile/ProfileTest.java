package com.springboot.test.profile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: test
 * author: dudy
 * create: 2020-02-01 15:47
 * description:
 **/
@SpringBootTest
@ComponentScan("com.springboot.test.profile")
public class ProfileTest {

	@Autowired
	private TestBean testBean;

	/**
	 * @todo 这个测试类有问题，暂留
	 */
	@Test
	public void testProfile(){
		System.out.println(testBean);
	}
}
