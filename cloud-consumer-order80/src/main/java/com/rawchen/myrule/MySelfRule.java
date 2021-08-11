package com.rawchen.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author RawChen
 * @date 2021/8/11 23:27
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		return new RandomRule();	//定义为随机
	}

}
