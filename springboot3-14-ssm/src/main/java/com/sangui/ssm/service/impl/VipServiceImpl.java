package com.sangui.ssm.service.impl;


import com.sangui.ssm.bean.Vip;
import com.sangui.ssm.mapper.VipMapper;
import com.sangui.ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-28
 * @Description: VipServiceImpl
 * @Version: 1.0
 */
@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper vipMapper;

    @Override
    public Vip findByCardNumber(String cardNumber) {
        return vipMapper.selectByCardNumber(cardNumber);
    }
}
