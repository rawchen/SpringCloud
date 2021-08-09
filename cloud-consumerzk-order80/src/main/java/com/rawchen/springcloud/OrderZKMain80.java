package com.rawchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RawChen
 * @date 2021/8/9 12:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderZKMain80.class, args);
	}
}
