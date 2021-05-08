package com.panda.complex.exception;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString
public class ResultBody {
    /**
     * 错误信息
     */
    private String errorCode;
    /**
     * 错误码
     */
    private String errorMsg;
    /**
     * 响应body信息
     */
    private Object result;

    public ResultBody() {

    }


    public ResultBody (BaseErrorInfoInterface baseErrorInfoInterface){
        this.errorCode = baseErrorInfoInterface.getErrorCode();
        this.errorMsg = baseErrorInfoInterface.getErrorCode();
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static ResultBody success(Object data) {
        ResultBody rb = new ResultBody();
        rb.setErrorCode(CommonEnum.SUCCESS.getErrorCode());
        rb.setErrorMsg(CommonEnum.SUCCESS.getErrorMsg());
        rb.setResult(data);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error(BaseErrorInfoInterface errorInfo) {
        ResultBody rb = new ResultBody();
        rb.setErrorCode(errorInfo.getErrorCode());
        rb.setErrorMsg(errorInfo.getErrorMsg());
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error(String code, String message) {
        ResultBody rb = new ResultBody();
        rb.setErrorCode(code);
        rb.setErrorMsg(message);
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static ResultBody error( String message) {
        ResultBody rb = new ResultBody();
        rb.setErrorCode("-1");
        rb.setErrorMsg(message);
        rb.setResult(null);
        return rb;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }









}
