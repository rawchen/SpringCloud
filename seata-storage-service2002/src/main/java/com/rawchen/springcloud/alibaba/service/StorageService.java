package com.rawchen.springcloud.alibaba.service;

/**
 * @author RawChen
 * @date 2021/8/30 20:16
 */
public interface StorageService {

	/**
	 * 扣减库存
	 */
	void decrease(Long productId, Integer count);

}
