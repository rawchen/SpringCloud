package com.rawchen.springcloud.alibaba.service.impl;

import com.rawchen.springcloud.alibaba.dao.OrderDao;
import com.rawchen.springcloud.alibaba.domain.Order;
import com.rawchen.springcloud.alibaba.service.AccountService;
import com.rawchen.springcloud.alibaba.service.OrderService;
import com.rawchen.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author RawChen
 * @date 2021/8/30 0:08
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderDao orderDao;

	@Resource
	private StorageService storageService;

	@Resource
	private AccountService accountService;

	/**
	 * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
	 * 简单说：下订单->扣库存->减余额->改状态
	 * http://localhost:2001/order/create?userId=1&productId=1&count=10&money=100
	 * @param order
	 */
	@Override
	@GlobalTransactional(name = "rawchen-create-order", rollbackFor = Exception.class)
	public void create(Order order) {

		//1 新建订单
		System.out.println("----->开始新建订单");
		orderDao.create(order);

		//2 扣减库存
		System.out.println("----->订单微服务开始调用库存，做扣减Count");
		storageService.decrease(order.getProductId(),order.getCount());
		System.out.println("----->订单微服务开始调用库存，做扣减end");

		//3 扣减账户
		System.out.println("----->订单微服务开始调用账户，做扣减Money");
		accountService.decrease(order.getUserId(),order.getMoney());
		System.out.println("----->订单微服务开始调用账户，做扣减end");

		//4 修改订单状态，从零到1,1代表已经完成
		System.out.println("----->修改订单状态开始");
		orderDao.update(order.getUserId(),0);
		System.out.println("----->修改订单状态结束");

		System.out.println("----->订单结束END");
	}
}
