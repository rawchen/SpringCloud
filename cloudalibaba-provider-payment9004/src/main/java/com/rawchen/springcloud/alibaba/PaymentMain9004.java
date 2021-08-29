package com.rawchen.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RawChen
 * @date 2021/8/29 14:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9004.class, args);
	}
}
