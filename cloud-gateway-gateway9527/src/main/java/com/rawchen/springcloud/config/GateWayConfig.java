package com.rawchen.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author RawChen
 * @date 2021/8/20 14:50
 */
@Configuration
public class GateWayConfig {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
		RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
		routes.route("path_route_rawchen1",
				r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
		return routes.build();
	}

	@Bean
	public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
		RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
		routes.route("path_route_rawchen2",
				r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
		return routes.build();
	}
}
