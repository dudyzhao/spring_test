package com.springboot.test.async.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 15:18
 * description:
 **/
@Service
public class AsyncTaskService {

	@Async // 会自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
	public void executeAsyncTask(Integer integer) {
		System.out.println(Thread.currentThread().getName() + " 执行异步任务：" + integer);
	}

	@Async
	public void executeAsyncTaskPlus(Integer integer) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + " 执行异步任务+1:" + integer);
	}
}
