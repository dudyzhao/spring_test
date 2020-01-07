package com.springboot.test.value;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @program: test
 * author: dudy
 * create: 2020-01-06 14:23
 * description:
 **/
@Service
@Data
public class TestValueService {
	@Value("我是TestValueService的属性")
	public String author;

}
