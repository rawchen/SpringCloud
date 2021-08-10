package com.rawchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RawChen
 * @date 2021/8/10 22:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderConsulMain80.class, args);
	}
}
