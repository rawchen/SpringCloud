package com.rawchen.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RawChen
 * @date 2021/8/24 11:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
	public static void main(String[] args) {
		SpringApplication.run(OrderNacosMain83.class, args);
	}
}
