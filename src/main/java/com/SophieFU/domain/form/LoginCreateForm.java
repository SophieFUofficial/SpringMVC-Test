package com.SophieFU.domain.form;

import com.SophieFU.util.ValidUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@ApiModel(description = "注册信息")
public class LoginCreateForm {

    @ApiModelProperty(value = "用户昵称")
    private String userName;

    @ApiModelProperty(value = "用户密码")
    @NotNull(message = "用户密码不能为空")
    private String password;

    @ApiModelProperty(value = "确认密码")
    @NotNull(message = "确认密码不能为空")
    private String confirmPassword;

    @ApiModelProperty(value = "手机号")
    @NotNull(message = "手机号不能为空")
    @Pattern(regexp = ValidUtil.MOBILE,message = "请输入正确的手机号码")
    private String phone;

    @ApiModelProperty(value = "登录类型")
    private Integer loginType;
}
