package com.okracode.platform.okra.site.web.exp;

import lombok.Getter;

/**
 * 自定义异常
 *
 * @author Eric Ren
 * @version 1.0.0
 * @date 2021/8/18
 */
@Getter
public class APIException  extends RuntimeException {
    private int code;
    private String msg;

    public APIException() {
        this(1001, "接口错误");
    }

    public APIException(String msg) {
        this(1001, msg);
    }

    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
