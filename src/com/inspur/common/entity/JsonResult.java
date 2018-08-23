package com.inspur.common.entity;

import java.io.Serializable;

/**
 * Created by LiuLiHao on 2018/8/23 7:24.
 * 描述： 返回给前台的消息
 * 作者： LiuLiHao
 */
public class JsonResult implements Serializable {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
