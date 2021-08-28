package com.rawchen.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author RawChen
 * @date 2021/8/28 12:21
 */
@RestController
public class FlowLimitController {

	@GetMapping("/testA")
	public String testA() {
//		try {
//			TimeUnit.MILLISECONDS.sleep(800);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return "-----testA()-----";
	}

	@GetMapping("/testB")
	public String testB() {
		System.out.println(Thread.currentThread().getName() + "\t" + "---testB()---");
		return "-----testB()-----";
	}

	@GetMapping("/testD")
	public String testD() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		System.out.println(Thread.currentThread().getName() + "\t" + "---testD()--- 测试RT");

		System.out.println(Thread.currentThread().getName() + "\t" + "---testD()--- 测试异常比例");
		int age = 10/0;
		return "-----testD()-----";
	}

	@GetMapping("/testE")
	public String testE() {
		System.out.println(Thread.currentThread().getName() + "\t" + "---testE()--- 测试异常数");
		int age = 10/0;
		return "-----testE()-----";
	}
}
