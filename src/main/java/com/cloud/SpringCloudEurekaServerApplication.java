package com.cloud;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
		// 读取控制台输入，决定使用哪个profiles
		Scanner scan = new Scanner(System.in);
		String profiles = scan.nextLine();
		new SpringApplicationBuilder(SpringCloudEurekaServerApplication.class)
			.properties("spring.profiles.active=" + profiles).web(true).run(args);
		scan.close();
	}

}

