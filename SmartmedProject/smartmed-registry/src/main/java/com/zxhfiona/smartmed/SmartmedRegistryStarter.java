package com.zxhfiona.smartmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>智慧医疗信息平台 - Eureka 注册中心启动类</b>
 *
 * @author Fiona
 * @date 2021/12/29
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class SmartmedRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(SmartmedRegistryStarter.class, args);
	}
}
