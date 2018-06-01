package com.SophieFU.mapper;

import com.SophieFU.domain.po.LoginPo;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    /**
     * 获得用户编号
     * @return
     */
    String queryUserId();

    /**
     * 添加用户信息
     * @param loginpo
     */
    void addLogin(LoginPo loginpo);

    /**
     * 查询注册手机号是否重复
     * @param phone
     * @return
     */
    int queryPhone(String phone);
}
