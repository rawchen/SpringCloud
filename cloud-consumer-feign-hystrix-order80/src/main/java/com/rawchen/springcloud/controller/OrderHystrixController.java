package com.rawchen.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.rawchen.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @author RawChen
 * @date 2021/8/15 23:31
 */
@RestController
@Slf4j
public class OrderHystrixController {

	@Resource
	private PaymentHystrixService paymentHystrixService;

	@GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentHystrixService.paymentInfo_OK(id);
		return result;
	}

	@HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
	})
	@GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
	public String paymentInfo_TimeOut(@PathParam("id") Integer id) {
		int age = 10/0;
		String result = paymentHystrixService.paymentInfo_TimeOut(id);
		return result;
	}

	public String paymentTimeOutFallbackMethod(Integer id) {
		return "线程池: " + Thread.currentThread().getName() + "8001支付系统繁忙或自己运行出错，id: " + id + "\t T 降级方案";
	}
}
