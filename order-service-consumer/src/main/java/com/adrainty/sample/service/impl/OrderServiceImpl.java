package com.adrainty.sample.service.impl;

import com.adrainty.sample.bean.UserAddress;
import com.adrainty.sample.service.OrderService;
import com.adrainty.sample.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/30 23:42
 */

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    // @Autowired
    @Reference
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        log.info("Receive userId: " + userId);
        List<UserAddress> addresses = userService.getUserAddressList(userId);
        log.debug("Search all userAddress list: " + addresses);
        return addresses;
    }
}
