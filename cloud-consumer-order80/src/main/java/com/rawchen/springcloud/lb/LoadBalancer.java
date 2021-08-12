package com.rawchen.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author RawChen
 * @date 2021/8/12 16:13
 */
public interface LoadBalancer {

	ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
