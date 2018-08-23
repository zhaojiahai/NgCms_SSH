/**
 * 表单验证
 * @param domId 表单的id
 * 如果需要填写的input 添加req=req属性
 * 提示信息为 msg='xxx'
 */
function formValueCheck(domId) {
    var arr = $("#"+domId+" input[req='req']");
    //检索需要填写的input
    for(var i=0;i<arr.length;i++){
        if( objIsNull(arr[i].value)){
            //获取提示信息
            var msg = $(arr[i]).attr('msg');
            if( !objIsNull(msg)){
                layer.msg('请填写'+ msg);
                return false;
            }else {
                layer.msg('请检查是否填写完整!')
                return false;
            }
        }
    }
    return true;
}