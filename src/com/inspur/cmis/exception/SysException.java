package com.inspur.cmis.exception;

/**
 * Created by LiuLiHao on 2018/8/23 15:37.
 * 描述： 异常信息
 * 作者： LiuLiHao
 */
public class SysException extends RuntimeException {
    public SysException() {
    }

    public SysException(String message) {
        super(message);
    }
}
