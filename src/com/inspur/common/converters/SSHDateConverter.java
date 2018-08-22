package com.inspur.common.converters;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by LiuLiHao on 2018/8/22 16:37.
 * 描述： 日期转化
 * 作者： LiuLiHao
 */
public class SSHDateConverter extends StrutsTypeConverter {
    private DateFormat dateFormat;

    {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        if(toClass == Date.class){
            try {
                return dateFormat.parse(values[0]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public String convertToString(Map context, Object o) {
        if(o instanceof Date){
            return dateFormat.format((Date)o);
        }
        return null;
    }
}
