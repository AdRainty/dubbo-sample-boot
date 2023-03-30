package com.adrainty.sample.controller;

import com.adrainty.sample.bean.UserAddress;
import com.adrainty.sample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/30 23:41
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);
    }

}
