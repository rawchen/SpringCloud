package com.rawchen.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author RawChen
 * @date 2021/8/10 22:58
 */
@Configuration
public class ApplicationContextConfig {

	@Bean
	@LoadBalanced    //赋予RestTemplate负载均衡的能力
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
