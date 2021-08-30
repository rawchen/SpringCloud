package com.rawchen.springcloud.alibaba.service.impl;

import com.rawchen.springcloud.alibaba.dao.AccountDao;
import com.rawchen.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 账户业务实现类
 *
 * @author RawChen
 * @date 2021/8/30 20:33
 */
@Service
public class AccountServiceImpl implements AccountService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Resource
	AccountDao accountDao;

	/**
	 * 扣减账户余额
	 */
	@Override
	public void decrease(Long userId, BigDecimal money) {
//		LOGGER.info("----->account-service中扣减账户余额开始");
		System.out.println("----->account-service中扣减账户余额开始");
		//模拟超时异常，全局事务回滚
		//暂停几秒钟线程
//		try {
//			TimeUnit.SECONDS.sleep(20);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		accountDao.decrease(userId, money);
//		LOGGER.info("----->account-service中扣减账户余额结束");
		System.out.println("----->account-service中扣减账户余额结束");
	}
}