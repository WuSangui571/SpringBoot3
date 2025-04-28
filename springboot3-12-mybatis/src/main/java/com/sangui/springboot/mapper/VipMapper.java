package com.sangui.springboot.mapper;

import com.sangui.springboot.bean.Vip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sangui
 */
//@Mapper
public interface VipMapper {
    /**
     * 保存会员信息
      * @return 1表示成功，0表示失败
     */
    int insert(Vip vip);

    /**
     * 获取所有会员列表
     * @return 会员列表List
     */
    List<Vip> selectAll();
}
