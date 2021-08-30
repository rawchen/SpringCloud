package com.rawchen.springcloud.alibaba.service;

import com.rawchen.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author RawChen
 * @date 2021/8/30 0:10
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

	@PostMapping(value = "/storage/decrease")
	CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
