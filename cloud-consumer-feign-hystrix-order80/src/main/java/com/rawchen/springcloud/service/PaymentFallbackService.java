package com.rawchen.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author RawChen
 * @date 2021/8/18 11:08
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
	@Override
	public String paymentInfo_OK(Integer id) {
		return "-----PaymentFallbackService OK-----";
	}

	@Override
	public String paymentInfo_TimeOut(Integer id) {
		return "-----PaymentFallbackService Timeout-----";
	}
}
