package com.springboot.test.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-07 16:54
 * description:
 **/
@Service
public class ScheduledService {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	protected void reportCurrentTime() {
		System.out.println("计划任务，每5s执行一次 ->" + dateFormat.format(new Date()));
	}

	@Scheduled(cron = "0/2 * * * * ? ")
	public void fixTime(){
		System.out.println("计划任务，每2s执行因此 ->" + dateFormat.format(new Date()));
	}
}
