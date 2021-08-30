package com.rawchen.springcloud.alibaba.service.impl;

import com.rawchen.springcloud.alibaba.dao.StorageDao;
import com.rawchen.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author RawChen
 * @date 2021/8/30 20:16
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
//        LOGGER.info("----->storage-service中扣减库存开始");
        System.out.println("----->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
//        LOGGER.info("----->storage-service中扣减库存结束");
        System.out.println("----->storage-service中扣减库存结束");
    }
}
