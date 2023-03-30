package com.adrainty.sample.service;

import com.adrainty.sample.bean.UserAddress;

import java.util.List;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/30 23:35
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId 用户Id
     */
    public List<UserAddress> initOrder(String userId);

}
