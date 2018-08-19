/**
 * Created by Administrator on 2018/8/18.
 */
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