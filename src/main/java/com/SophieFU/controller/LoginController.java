package com.SophieFU.controller;


import com.SophieFU.domain.form.LoginCreateForm;
import com.SophieFU.domain.po.LoginPo;
import com.SophieFU.response.ResponseBase;
import com.SophieFU.service.LoginService;
import com.SophieFU.util.CopyUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
@Api(value = "/login", description = "用户登录注册")
public class LoginController extends BaseController{

    @Autowired
    private LoginService loginservice;

    @ApiOperation(value = "用户注册", notes = "用户注册", httpMethod = "POST")
    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    ResponseBase register(@ModelAttribute @Valid LoginCreateForm form){
        if(!form.getPassword().equals(form.getConfirmPassword())){
            return getFailResult("两次密码不一致！");
        }
        LoginPo loginpo = CopyUtil.transfer(form,LoginPo.class);
        String userId = loginservice.getUserId();
        loginpo.setUserId(userId);
        loginservice.addLogin(loginpo);
        return getSuccessResult();
    }



}
