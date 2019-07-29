package com.pan.model.service.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: Pan P Zhu
 * @Date: 29/07/2019 17:31
 * @Description:
 */
@Getter
@Setter
@ToString
public class OrderModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    private Integer orderNo;

    /**
     * 订单名称
     */
    private String orderName;

}
