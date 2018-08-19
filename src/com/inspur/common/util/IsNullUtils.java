package com.inspur.common.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by LiuLiHao on 2018/8/17 23:33.
 * 描述： 判断对象是否为空
 * 作者： LiuLiHao
 */
public class IsNullUtils {

    /**
     * 判空
     * @return 为空返回 true 非空返回 false
     */
    public static boolean isContainsNull(String... arr){
        if (arr!=null && arr.length>0){
            for (int i=0;i<arr.length;i++){
                String s = arr[i];
                if (StringUtils.isBlank(s)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 是否为空
     * @return 为空返回 true
     *         非空返回 false
     */
    public static boolean isNull(Object... arr){
        if (arr!=null && arr.length>0){
            for (int i=0;i<arr.length;i++){
                Object o = arr[i];

                if (o instanceof String && StringUtils.isBlank((String) o)){
                    return true;
                }
                else if (o==null){
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean arrayIsNotNull(Object[] arr){
        return arr!=null && arr.length>0;
    }


    /**
     * 是否不为空
     * @return
     */
    public static boolean isNotNull(Object... arr){
        if (arr!=null && arr.length>0){
            for (int i=0;i<arr.length;i++){
                Object o = arr[i];

                if (o instanceof String && StringUtils.isBlank((String) o)){
                    return false;
                }else if (o==null){
                    return false;
                }

            }
        }
        return true;
    }

}
