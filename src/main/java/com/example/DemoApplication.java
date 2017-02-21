package com.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

@SpringBootApplication
@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Service
	public static class Startup implements ApplicationRunner {

		private final HelloService helloService;

		public Startup(HelloService helloService) {
			this.helloService = helloService;
		}

		@Override
		public void run(ApplicationArguments applicationArguments) throws Exception {
			System.out.println("1+1, 2 times");
			helloService.add(1, 1);
			helloService.add(1, 1);
			System.out.println("Done");

			System.out.println("2+2, 2 times");
			helloService.add(2, 2);
			helloService.add(2, 2);
			System.out.println("Done");
		}
	}
}
