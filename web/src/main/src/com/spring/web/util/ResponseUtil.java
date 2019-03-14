package com.spring.web.util;

/**
 * Created by 张文旭 on 2019/3/14.
 */
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;


    public ResponseUtil(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseUtil(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseUtil{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
