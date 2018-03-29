package com.SophieFU.controller;

import com.SophieFU.response.ResponseBase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;

public class BaseController {
    private static final int RESCODE_OK = 200;
    private static final int RESCODE_FAIL = 201;

    /**
     * 运行期异常控制
     *
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public
    @ResponseBody
    ResponseBase runtimeExceptionHandler(RuntimeException e) {
        return this.getFailResult(500,"系统异常，请和管理员联系！");
    }

    protected ResponseBase getSuccessResult() {
        return getSuccessResult("操作成功");
    }

    protected ResponseBase getFailResult(String msg) {
        return this.getFailResult(RESCODE_FAIL, msg);
    }

    protected ResponseBase getSuccessResult(String msg) {
        return new ResponseBase("ok", RESCODE_OK, msg, Collections.EMPTY_MAP);
    }

    protected ResponseBase getFailResult(int errCode, String msg) {
        return new ResponseBase("fail", errCode, msg, Collections.EMPTY_MAP);
    }
}
