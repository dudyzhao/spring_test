package com.springboot.test.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.sql.ResultSet;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 11:57
 * description:
 **/
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	private String beanName;
	private ResourceLoader resourceLoader;
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	public void outputResult(){
		System.out.println("Bean的名称 -> " + beanName);
		Resource resource = resourceLoader.getResource("classpath:value.properties");
		try {
			System.out.println("加载的资源内容 -> " + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
