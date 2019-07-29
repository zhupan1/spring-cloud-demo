package com.pan.model.service.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: Pan P Zhu
 * @Date: 25/07/2019 19:59
 * @Description:
 */
@Getter
@Setter
@ToString
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;


}
