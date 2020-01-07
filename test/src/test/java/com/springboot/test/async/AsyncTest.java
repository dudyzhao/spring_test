package com.springboot.test.async;

import com.springboot.test.async.service.AsyncTaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 15:26
 * description:
 **/
@SpringBootTest
@EnableAsync
@ComponentScan("com.springboot.test.async")
public class AsyncTest {
	@Autowired
	private AsyncTaskService asyncTaskService;

	@Test
	public void testAsync(){
		for (int i = 0; i < 100; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
	}
}
