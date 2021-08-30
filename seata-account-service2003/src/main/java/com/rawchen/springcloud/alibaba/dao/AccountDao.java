package com.rawchen.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author RawChen
 * @date 2021/8/30 20:29
 */
@Mapper
public interface AccountDao {

	/**
	 * 扣减账户余额
	 */
	void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}