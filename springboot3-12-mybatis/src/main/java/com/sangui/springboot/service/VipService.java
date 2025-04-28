package com.sangui.springboot.service;

import com.sangui.springboot.bean.Vip;

import java.util.List;

/**
 * @author sangui
 */
public interface VipService {
    /**
     * 保存会员信息
     * @param vip 会员信息
     * @return 保存true表示保存成功，false表示失败
     */
    boolean saveVip(Vip vip);

    /**
     * 查看会员列表
     * @return 返回会员列表
     */
    List<Vip> getAll();
}
