package com.rawchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author RawChen
 * @date 2021/8/21 18:46
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientMain3355.class, args);
	}
}
