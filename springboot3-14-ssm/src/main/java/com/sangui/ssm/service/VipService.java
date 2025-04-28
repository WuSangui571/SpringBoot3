package com.sangui.ssm.service;

import com.sangui.ssm.bean.Vip;

/**
 * @author root
 */
public interface VipService {
    /**
     * 根据 会员卡号 查询会员信息
     * @param cardNumber 会员卡号
     * @return 会员信息
     */
    Vip findByCardNumber(String cardNumber);

}
