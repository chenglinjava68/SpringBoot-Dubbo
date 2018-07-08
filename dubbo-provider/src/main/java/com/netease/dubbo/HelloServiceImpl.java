package com.netease.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author 梦境迷离
 * @title: HelloServiceImpl
 * @description: 提供者-Hello具体实现
 * @date 2018-07-08
 */
@Service
@Component
public class HelloServiceImpl implements IHelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name + " !";
	}

}
