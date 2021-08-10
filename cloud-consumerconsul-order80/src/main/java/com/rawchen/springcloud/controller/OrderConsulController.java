package com.rawchen.springcloud.controller;

import com.rawchen.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author RawChen
 * @date 2021/8/10 22:58
 */
@RestController
@Slf4j
public class OrderConsulController {

	public static final String INVOKE_URL = "http://consul-provider-payment";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/consumer/payment/consul")
	public String paymentInfo(Payment payment) {
		String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
		return result;
	}
}
