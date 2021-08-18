package com.rawchen.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author RawChen
 * @date 2021/8/15 22:51
 */
@Service
public class PaymentService {

	/**
	 * 正常访问的OK方法
	 *
	 * @param id
	 * @return
	 */
	public String paymentInfo_OK(Integer id) {
		return "线程池: " + Thread.currentThread().getName() + "paymentInfo_OK: " + id + "\t T";
	}

	/**
	 * 超时方法
	 *
	 * @param id
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
	})
	public String paymentInfo_TimeOut(Integer id) {
		int timeNumber = 5;
//		int age = 10/0;
		try {
			TimeUnit.SECONDS.sleep(timeNumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "线程池: " + Thread.currentThread().getName() + "paymentInfo_OK: " + id + "\t T 耗时(s): " + timeNumber;
	}

	public String paymentInfo_TimeOutHandler(Integer id) {
		return "线程池: " + Thread.currentThread().getName() + "8001系统繁忙或运行报错，id: " + id + "\t T 降级方案";
	}

	/**
	 * 服务熔断
	 *
	 * @param id
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallack", commandProperties = {
			@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否开启断路器
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),//失败率达到多少后跳闸
	})
	public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
		if (id < 0) {
			throw new RuntimeException("*****ID不能为负数*****");
		}
		String serialNumber = IdUtil.simpleUUID();
		return Thread.currentThread().getName() + "\t调用成功，流水号：" + serialNumber;
	}

	public String paymentCircuitBreakerFallack(@PathVariable("id") Integer id) {
		return "id不能为负数。" + id;
	}
}
