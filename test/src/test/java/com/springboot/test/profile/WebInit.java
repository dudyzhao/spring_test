package com.springboot.test.profile;


import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @program: test
 * author: dudy
 * create: 2020-02-01 15:13
 * description:
 **/
public class WebInit implements WebApplicationInitializer {
	/**
	 * 指定spring的默认环境时dev环境
	 * @param servletContext
	 * @throws ServletException
	 */
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("spring.profiles.default", "dev");
	}
}
