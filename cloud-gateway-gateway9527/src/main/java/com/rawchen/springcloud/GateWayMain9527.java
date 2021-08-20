package com.rawchen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author RawChen
 * @date 2021/8/20 13:26
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
	public static void main(String[] args) {
		SpringApplication.run(GateWayMain9527.class, args);
	}
}
