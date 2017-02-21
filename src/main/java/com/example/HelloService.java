package com.example;

import javax.cache.annotation.CacheResult;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@CacheResult(cacheName = "numbers")
	public int add(int a, int b) {
		return a+b;
	}

}
