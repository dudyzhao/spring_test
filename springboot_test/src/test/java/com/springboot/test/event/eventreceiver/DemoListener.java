package com.springboot.test.event.eventreceiver;

import com.springboot.test.event.eventsource.DemoEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 11:08
 * description:
 **/
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
	@Override
	public void onApplicationEvent(DemoEvent event) {
		System.out.println(event.getMsg());
		System.out.println(event.getSource());
		System.out.println("我已经接受到消息了" + System.currentTimeMillis());
	}
}
