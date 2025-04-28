package com.sangui.springboot.service.impl;


import com.sangui.springboot.mapper.VipMapper;
import com.sangui.springboot.bean.Vip;
import com.sangui.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-26
 * @Description: VipService
 * @Version: 1.0
 */
@Service
public class VipServiceImpl implements VipService {

    @Autowired
    VipMapper vipMapper;

    @Override
    public boolean saveVip(Vip vip) {
        return vipMapper.insert(vip) > 0;
    }

    @Override
    public List<Vip> getAll() {
        return vipMapper.selectAll();
    }
}
