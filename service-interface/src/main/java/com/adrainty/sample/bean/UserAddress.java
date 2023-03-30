package com.adrainty.sample.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/30 23:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {

    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;

}
