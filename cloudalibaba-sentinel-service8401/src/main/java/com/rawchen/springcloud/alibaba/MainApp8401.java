package com.rawchen.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author RawChen
 * @date 2021/8/28 12:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
	public static void main(String[] args) {
		SpringApplication.run(MainApp8401.class, args);
	}
}
