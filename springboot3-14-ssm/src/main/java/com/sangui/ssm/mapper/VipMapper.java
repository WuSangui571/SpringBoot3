package com.sangui.ssm.mapper;

import com.sangui.ssm.bean.Vip;
import org.springframework.stereotype.Repository;

/**
 * @author sangui
 */
@Repository
public interface VipMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);

    Vip selectByCardNumber(String cardNumber);
}