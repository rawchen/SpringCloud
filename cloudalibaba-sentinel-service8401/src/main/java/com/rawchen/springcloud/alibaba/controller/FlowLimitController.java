package com.rawchen.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
