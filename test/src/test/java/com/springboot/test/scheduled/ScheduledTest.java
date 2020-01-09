package com.springboot.test.scheduled;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-09 11:22
 * description:
 **/
@SpringBootTest
@ComponentScan("com.springboot.test.scheduled")
@EnableScheduling
public class ScheduledTest {

	@Autowired
	private ScheduledService scheduledService;

	@Test
	public void test() throws Exception{
		scheduledService.reportCurrentTime();
		scheduledService.fixTime();
		Thread.sleep(100000);
	}
}
