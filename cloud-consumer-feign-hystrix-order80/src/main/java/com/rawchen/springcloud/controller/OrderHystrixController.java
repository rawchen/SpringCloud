package com.rawchen.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rawchen.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author RawChen
 * @date 2021/8/15 23:31
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderHystrixController {

	@Resource
	private PaymentHystrixService paymentHystrixService;

	@GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentHystrixService.paymentInfo_OK(id);
		return result;
	}

//	@HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
//			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//	})
	@HystrixCommand
	@GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
	public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
		int age = 10/0;
		String result = paymentHystrixService.paymentInfo_TimeOut(id);
		return result;
	}

	public String paymentTimeOutFallbackMethod(Integer id) {
		return "线程池: " + Thread.currentThread().getName() + "8001支付系统繁忙或自己运行出错，id: " + id + "\t T 降级方案";
	}

	//全局Fallback方法
	public String paymentGlobalFallbackMethod() {
		return "全局异常处理信息，稍后重试。";
	}
}
