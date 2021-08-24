package com.rawchen.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RawChen
 * @date 2021/8/24 10:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9002.class, args);
	}
}
