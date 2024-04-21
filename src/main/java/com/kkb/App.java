package com.kkb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Hashtable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@MapperScan("com.kkb.mapper")
@EnableScheduling
public class App {

	volatile int a = 3;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

		AtomicInteger atomicInteger = new AtomicInteger(5);
		Hashtable<String,String> h = new Hashtable<>();
		Executors executors;
		ThreadPoolExecutor threadPoolExecutor;

		//threadpoo
		ThreadLocal threadLocal;

	}

}
