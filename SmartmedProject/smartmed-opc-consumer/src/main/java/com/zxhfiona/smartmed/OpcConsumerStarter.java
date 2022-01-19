package com.zxhfiona.smartmed;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>智慧医疗信息平台 - 门诊功能模块 - Consumer 启动类</b>
 *
 * @author Fiona
 * @date 2021/12/30
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class OpcConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(OpcConsumerStarter.class, args);
	}
}
