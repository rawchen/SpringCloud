package com.rawchen.springcloud.alibaba.service;

import com.rawchen.springcloud.entities.CommonResult;
import com.rawchen.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author RawChen
 * @date 2021/8/29 15:22
 */
@Component
public class PaymentFallbackService implements PaymentService{
	@Override
	public CommonResult<Payment> paymentSQL(Long id) {
		return new CommonResult<>(4444, "服务降级返回，---PaymentFallbackService---", new Payment(id, "errorSerial"));
	}
}
