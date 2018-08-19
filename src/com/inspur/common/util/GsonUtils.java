package com.inspur.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by LiuLiHao on 2018/7/21 13:38.
 * desc： convert object to json string
 * author： LiuLiHao
 */
public class GsonUtils {

    //singleton mode
    private static final Gson gson = new Gson();
    private static final Gson gsonText = new GsonBuilder().disableHtmlEscaping().create();

    /**
     * 2json
     * @param object
     * @return
     */
    public static String toJson(Object object){
        return gson.toJson(object);
    }

    /**
     * 获取json字符串并忽略Unicode转义
     * @param object
     * @return
     */
    public static String toJsonText(Object object){
        return gsonText.toJson(object);
    }

    /**
     * json字符串转换成具体的类型
     * @param jsonString
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T toType(String jsonString, Class<T> clazz){
        try{
            return gson.fromJson(jsonString,clazz);
        }catch (Exception e){
            System.err.println(e.toString());
            return null;
        }
    }
}
