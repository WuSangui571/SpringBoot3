package com.sangui.ssm.controller;


import com.sangui.ssm.bean.Vip;
import com.sangui.ssm.mapper.VipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-28
 * @Description:
 * @Version: 1.0
 */
@RestController
public class VipController {
    @Autowired
    VipMapper vipMapper;

    @GetMapping("/detail")
    public Vip detail(@RequestParam("cn") String cardNumber){
        return vipMapper.selectByCardNumber(cardNumber);
    }
}
