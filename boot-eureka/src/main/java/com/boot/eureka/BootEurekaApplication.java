package com.boot.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class BootEurekaApplication implements CommandLineRunner {

	@Value("${server.port}")
	private String prot;

	public static void main(String[] args) {
		SpringApplication.run(BootEurekaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		log.info("************注册中心启动成功！！端口号：{}********************",prot);
	}
}
