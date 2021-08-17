package com.rawchen.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

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
}
