package com.rawchen.springcloud.controller;

import com.rawchen.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author RawChen
 * @date 2021/8/22 19:49
 */
@RestController
public class SendMessageController {

	@Resource
	private IMessageProvider messageProvider;

	@GetMapping(value = "/sendMessage")
	public String sendMessage() {
		return messageProvider.send();
	}
}
