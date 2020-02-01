package com.springboot.test.profile;

import lombok.Data;

/**
 * @program: test
 * author: dudy
 * create: 2020-02-01 15:33
 * description:
 **/
@Data
public class TestBean {
	private String content;

	public TestBean(String content) {
		this.content = content;
	}
}






