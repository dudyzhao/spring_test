package com.springboot.test.event.eventsource;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 11:06
 * description:
 **/
public class DemoEvent extends ApplicationEvent {
	private String msg;
	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
