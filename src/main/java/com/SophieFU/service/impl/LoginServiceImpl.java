package com.SophieFU.service.impl;

import com.SophieFU.domain.po.LoginPo;
import com.SophieFU.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SophieFU.mapper.LoginMapper;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String getUserId(){
        return loginMapper.queryUserId();
    }

    @Override
    public void addLogin(LoginPo loginpo){
        loginMapper.addLogin(loginpo);
    }

    @Override
    public int queryPhone(String phone){
        return loginMapper.queryPhone(phone);
    }
}
