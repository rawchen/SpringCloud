package com.rawchen.springcloud.alibaba.service;

import com.rawchen.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author RawChen
 * @date 2021/8/30 0:10
 */
@FeignClient(value = "seata-account-service")
public interface AccountService
{
	@PostMapping(value = "/account/decrease")
	CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}