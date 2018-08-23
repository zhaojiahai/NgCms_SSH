package com.inspur.common.util;

/**
 * Created by LiuLiHao on 2018/7/15 9:46.
 * 描述： 系统常量
 * 作者： LiuLiHao
 */
public interface Constants {
    /**
     * rsa 公钥
     */
    String PUB_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCSOALmVvE5bVFfvZASgLz1J4lvUH0SddzerZeQw6UiTZAfC+wDYizMn40IeGkX7Ypvs0FG9757iG3kmW0lad2wWWJRs4Ch8BDOr8EwYFG3glfGMlDJdkvXkq3KRHKXZ+sSo+zD9iiYW5Zbl9sGSmVgl2gMRmH0MX7/q4tIoyCfNwIDAQAB";

    /**
     * rsa 私钥
     */
    String PRI_KEY = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAJI4AuZW8TltUV+9kBKAvPUniW9QfRJ13N6tl5DDpSJNkB8L7ANiLMyfjQh4aRftim+zQUb3vnuIbeSZbSVp3bBZYlGzgKHwEM6vwTBgUbeCV8YyUMl2S9eSrcpEcpdn6xKj7MP2KJhblluX2wZKZWCXaAxGYfQxfv+ri0ijIJ83AgMBAAECgYBXIpffymoAbfvzURUdYai5c7E8K7wNFz3jWZGcDGtJMO21ArbIIWZPHrm+FXuTbdR00l8ROqxCE8BhXWkkxZz9Bb7dQbLM6vQ7F0MrJr8Phzd5sJ36clFCh1v9eO5MvLXQCGggczBAPD6iqHn/o5SnzkASiOU0GAJ3XX5C3HKNkQJBANa0pdLGOgKIHDkJ0KG9ploUi5iCRu3ayePP6QsiAViYXZkhTHZzhnhUliSb8OIuLRPSZsn/FeVm9TX6K5Zc/H8CQQCuV0+ltTQ0gKC3bJY/p7/csrv12Hq7EsGac5SrkvMh2Z1K38FI6s3HjOWsUmMNWaoFGKPfpD8fzI8n9AYiz+FJAkAXCZshWpOu4dvlYuA3+pl24O15l8D0lJ1FDHH899EdKHwiiigiLZMoJitWEkVuf3XmwpS05+H5k2qMOCOlJqURAkA5FRlc9lGbhyoYJJOlT/V/+32TZ0f4DJIbUhCxhLHauXfI1i5hA5BQ8A8bNvZ7nooOlRzC0vJgJQgSWtHPgCURAkAWOry3CA8GsXsZ2fYIeqCZXIGzd4Alv7TQRWlgppRy3WmdIwBkVgQhSIAT0HiUteWVYgexrIGC6rDNXE4zEKfL";


    /**
     * 允许上传的文件类型
     */
    String[] FILE_TYPES = {
            "jpg",
            "png"
    };

    /**
     * 允许上传的MIME文件类型
     */
    String[] MIME_TYPES = {
      "image/png",
      "image/jpeg"
    };

    /**
     *
     * 图片地址  填写对应的服务器地址
     *
     */
    String IMAGE_PATH = "http://192.168.0.101:8081/images/upload/";

    /**
     * user标记
     */
    String USER = "CURRENT_USER";

    /**
     * 在jsonobject message里使用
     */
    String MESSAGE = "message";

    /**
     * 消息提示  0正常 1 错误
     */
    String ERROR = "error";

    /**
     * token
     */
    String TOKEN = "token";


    /**
     * 系统热点账户
     */
    Integer SYSTEM_ACCOUNT = 1;
}
