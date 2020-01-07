package com.springboot.test.event;

import com.springboot.test.event.eventsource.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 11:09
 * description:
 **/
@Component
public class DemoPublish implements ApplicationEventPublisherAware {
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void publish(String msg) {
		applicationEventPublisher.publishEvent(new DemoEvent(this,msg));
	}
}
