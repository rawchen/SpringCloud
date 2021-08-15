package com.rawchen.springcloud.service;

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
	 * 正常访问的OK方法
	 *
	 * @param id
	 * @return
	 */
	public String paymentInfo_TimeOut(Integer id) {
		int timeNumber = 3;
		try {
			TimeUnit.SECONDS.sleep(timeNumber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "线程池: " + Thread.currentThread().getName() + "paymentInfo_OK: " + id + "\t T 耗时(s): " + timeNumber;
	}
}
