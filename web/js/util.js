/**
 * 判空运算
 * @param param 数组
 * @returns {boolean} 为空返回true
 */
function isNull(param) {
    return !param || param == undefined || param == null || param.length == 0;
}

/**
 * 普通对象或者字符串判空
 * @param param
 * @returns {boolean}
 */
function objIsNull(param) {
    return !param || param == undefined || param == null || param == '';
}
/**
 * get请求
 */
function getRequest() {
    $.ajax({
        type: 'get',
        url: url,
        dataType: 'json',
        //异步
        async:true,
        success: function (data) {
            //把字符串转为json对象
            var json = eval('(' + data + ')');
            callback.call(this,json);
        },
        error: function (err) {
            layer.msg("请求失败");
        }
    });
}
/**
 * post请求
 * @param url
 * @param data
 * @param callback
 */
function postRequest(url,data,callback) {
    if (objIsNull(url)){
        return;
    }
    $.ajax({
        type: 'post',
        url: url,
        data: data,
        dataType: 'json',
        //异步
        async:true,
        success: function (data) {
            //把字符串转为json对象
            var json = eval('(' + data + ')');
            callback.call(this,json);
        },
        error: function (err) {
            layer.msg("请求失败");
        }
    });
}