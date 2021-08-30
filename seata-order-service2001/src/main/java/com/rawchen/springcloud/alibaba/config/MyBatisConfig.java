package com.rawchen.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author RawChen
 * @date 2021/8/30 19:28
 */
@Configuration
@MapperScan({"com.rawchen.springcloud.alibaba.dao"})
public class MyBatisConfig {
}

