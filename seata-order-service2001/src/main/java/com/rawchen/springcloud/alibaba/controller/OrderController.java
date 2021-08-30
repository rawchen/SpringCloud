package com.rawchen.springcloud.alibaba.controller;

import com.rawchen.springcloud.alibaba.domain.CommonResult;
import com.rawchen.springcloud.alibaba.domain.Order;
import com.rawchen.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author RawChen
 * @date 2021/8/30 19:25
 */
@RestController
public class OrderController {

	@Resource
	private OrderService orderService;

	@GetMapping("/order/create")
	public CommonResult create(Order order) {
		orderService.create(order);
		return new CommonResult(200, "订单创建成功");
	}
}
