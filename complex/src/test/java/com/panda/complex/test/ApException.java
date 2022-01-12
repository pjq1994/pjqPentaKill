package com.panda.complex.test;

public class ApException implements ExceptionInfo{
    private String code;
    private String msg;


    public ApException(String errMsg) {
        System.out.println("进来父类构造");
        this.code = "";
        this.msg = errMsg;
    }

    @Override
    public String getErrorCode() {
        codeInit();
        return code;
    }

    private void codeInit() {
        String name = getClass().getName();
        System.out.println(name);
        System.out.println("进来了");
        code = "000000";
    }
}
