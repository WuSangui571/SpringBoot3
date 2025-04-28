package com.sangui.ssm.bean;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * t_vip
 * @author root
 */
@Builder
@Data
public class Vip implements Serializable {
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;

    private static final long serialVersionUID = 1L;
}