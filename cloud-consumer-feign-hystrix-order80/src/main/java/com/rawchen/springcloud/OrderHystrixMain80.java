package com.rawchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author RawChen
 * @date 2021/8/15 23:26
 */
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderHystrixMain80.class, args);
	}
}
