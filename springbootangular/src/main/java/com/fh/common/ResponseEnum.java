package com.fh.common;

public enum ResponseEnum {
    SUCCESS(200,"操作成功"),
    ERROR(1000,"操作失败"),
    IS_NULL_PHONE(1001,"手机号不能为空"),
    IS_NULL_CODE(1002,"发送失败"),
    IS_CODE(1003,"验证码为空"),
    IS_CODE_ERROR(1004,"请输入正确的验证码"),
    IS_NAME_MEMBER_NULL(1006,"member用户已存在"),
    IS_NOT_MEMBER_NULL(1006,"用户不存在"),
    IS_PHONE_MEMBER_NULL(1005,"member手机号已存在"),
    IS_MEMBER_NULL(1007,"请输入用户名和密码"),
    IS_MEMBER_NAME_ERROR(1008,"用户名错误"),
    IS_MEMBER_NAME_NULL(1009,"请输入用户名"),
    IS_MEMBER_PASSWORD_NULL(1010,"请输入密码"),
    IS_MEMBER_PASSWORD_ERROR(1011,"密码错误"),
    TOKEN_IS_NULL(1012,"token为空"),
    ;
    private int code;
    private String msg;

    ResponseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
