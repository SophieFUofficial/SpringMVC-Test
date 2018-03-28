package com.SophieFU.service;

import com.SophieFU.domain.po.LoginPo;

public interface LoginService {
    /**
     * 获得用户编号
     * @return
     */
    String getUserId();

    /**
     * 添加用户信息
     * @param loginpo
     */
    void addLogin(LoginPo loginpo);
}
