package com.springboot.test.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @program: test
 * author: dudy
 * create: 2020-02-01 15:33
 * description:
 **/
@Configuration
@ComponentScan("com.springboot.test.profile")
public class ProfileConfiguration {
	@Bean
	@Profile("dev")
	public TestBean testBean() {
		return new TestBean("dev");
	}
	@Bean
	@Profile("product")
	public TestBean productBean() {
		return new TestBean("product");
	}

}
