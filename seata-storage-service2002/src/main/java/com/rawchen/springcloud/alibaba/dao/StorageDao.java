package com.rawchen.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author RawChen
 * @date 2021/8/30 20:13
 */
@Mapper
public interface StorageDao {

	//扣减库存
	void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
