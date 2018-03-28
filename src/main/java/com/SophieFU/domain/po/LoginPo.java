package com.SophieFU.domain.po;

import lombok.Data;

@Data
public class LoginPo {

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 登录类型：0.管理员1.普通用户
     */
    private String loginType;
}
