package com.rawchen.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author RawChen
 * @date 2021/8/30 20:12
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
