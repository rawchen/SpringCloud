package com.rawchen.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RawChen
 * @date 2021/8/24 10:26
 */
@RestController
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/nacos/{id}")
	public String getPayment(@PathVariable("id") Integer id) {
		return "nacos registry, serverPort: " + serverPort + ", id: " + id;
	}
}
