package com.inspur.common.util;

import com.google.gson.JsonObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LiuLiHao on 2018/7/17 21:01.
 * 描述： 返回信息
 * 作者： LiuLiHao
 */
public class ResponseUtils {


    /**
     * 发送指定类型数据
     * @param text
     */
    public static void render(HttpServletResponse response, String contentType, String text){
        response.setContentType(contentType);
        try {
            response.getWriter().write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回信息不完整消息
     */
    public static void retnFailMsg(HttpServletResponse response, JsonObject jsonObject){
        jsonObject.addProperty(Constants.ERROR,1);
        jsonObject.addProperty(Constants.MESSAGE,"参数不完整!");
        renderJson(response,jsonObject.toString());
    }

    public static void retnSuccessMsg(HttpServletResponse response,
                                      JsonObject jsonObject,
                                      String msg){
        jsonObject.addProperty(Constants.ERROR,0);
        jsonObject.addProperty(Constants.MESSAGE,msg);
        renderJson(response,jsonObject.toString());
    }

    public static void retnFailMsg(HttpServletResponse response
                                 ,JsonObject jsonObject,
                                   String msg){
        jsonObject.addProperty(Constants.ERROR,1);
        jsonObject.addProperty(Constants.MESSAGE,msg);
        renderJson(response,jsonObject.toString());
    }


    /**
     * 返回成功消息
     */
    public static void retnSuccessMsg(HttpServletResponse response,
                                      JsonObject jsonObject){
        jsonObject.addProperty(Constants.ERROR,0);
        jsonObject.addProperty(Constants.MESSAGE,"操作完成");
        renderJson(response,jsonObject.toString());
    }

    /**发送json*/
    public static void renderJson(HttpServletResponse response, String text){
        response.addHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Origin","*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        render(response, "application/json;charset=UTF-8", text);
    }

    /**发送xml*/
    public static void renderXml(HttpServletResponse response, String text){
        render(response, "text/xml;charset=UTF-8", text);
    }

    /**发送text*/
    public static void renderText(HttpServletResponse response, String text){
        render(response, "application/plain;charset=UTF-8", text);
    }

}
