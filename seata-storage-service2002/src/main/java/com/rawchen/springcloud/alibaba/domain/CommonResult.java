package com.rawchen.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author RawChen
 * @date 2021/8/30 20:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

	private Integer code;
	private String message;
	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}
}