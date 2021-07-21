package com.rawchen.springcloud.entities;

import java.io.Serializable;

@Data
public class Payment implements Serializable {
	private Long id;
	private String serial;
}
