package com.rawchen.springcloud.controller;

import com.rawchen.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author RawChen
 * @date 2021/8/9 12:05
 */
@RestController
@Slf4j
public class OrderZKController {

	public static final String INVOKE_URL = "http://cloud-provider-payment";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/zk")
	public String paymentInfo(Payment payment) {
		String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
		return result;
	}
}
