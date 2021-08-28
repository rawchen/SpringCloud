package com.rawchen.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.rawchen.springcloud.entities.CommonResult;
import com.rawchen.springcloud.entities.Payment;

/**
 * @author RawChen
 * @date 2021/8/28 14:58
 */
public class CustomerBlockHandler {
	public static CommonResult handlerException(BlockException e) {
		return new CommonResult(444, "按客户自定义，global handlerException-----1", new Payment(2021L, "serial003"));
	}

	public static CommonResult handlerException2(BlockException e) {
		return new CommonResult(444, "按客户自定义，global handlerException-----2", new Payment(2021L, "serial003"));
	}
}
