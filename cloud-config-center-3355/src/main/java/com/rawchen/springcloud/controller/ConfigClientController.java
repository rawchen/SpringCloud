package com.rawchen.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RawChen
 * @date 2021/8/21 18:48
 */
@RestController
public class ConfigClientController {

	@Value("${config.info}")
	private String configInfo;

	@GetMapping("/configInfo")
	public String getConfigInfo() {
		return configInfo;
	}
}
