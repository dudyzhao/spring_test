package com.springboot.test.value;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-06 14:15
 * description:
 **/
@Configuration
@Component
@PropertySource("/value.properties")
public class ELConfiguration {

	@Value("I love you")
	private String normalString;

	@Value("#{systemProperties['os.name']}")
	private String osName;

	@Value("#{T(java.lang.Math).random() * 100.0}")
	private double randomNumber;

	@Value("#{testValueService.author}")
	private String otherServiceProperty;

	@Value("classpath:value.properties")
	private Resource file;

	@Value("http://www.bing.com")
	private Resource url;

	@Value("${test.value.name}")
	private String name;

	@Value("${test.value.config}")
	private String config;

	@Autowired
	private Environment environment;

	public void outputResource(){
		try {
			System.out.println(normalString);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(otherServiceProperty);
			System.out.println(IOUtils.toString(file.getInputStream()));
			System.out.println(IOUtils.toString(url.getInputStream()));
			System.out.println(name);
			System.out.println(config);
			System.out.println(environment.getProperty("test.value.config"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
