package com.rawchen.springcloud.service;

import com.rawchen.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author RawChen
 * @date 2021/8/14 17:11
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

	@GetMapping(value = "/payment/get/{id}")
	public CommonResult getPaymentById(@PathVariable("id") Long id);

	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout();
}
