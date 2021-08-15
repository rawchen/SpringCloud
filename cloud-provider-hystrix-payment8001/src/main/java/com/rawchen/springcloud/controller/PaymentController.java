package com.rawchen.springcloud.controller;

import com.rawchen.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @author RawChen
 * @date 2021/8/15 23:01
 */
@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentService.paymentInfo_OK(id);
		log.info("result: " + result);
		return result;
	}

	@GetMapping(value = "/payment/hystrix/timeout/{id}")
	public String paymentInfo_TimeOut(@PathParam("id") Integer id) {
		String result = paymentService.paymentInfo_TimeOut(id);
		log.info("result: " + result);
		return result;
	}
}
