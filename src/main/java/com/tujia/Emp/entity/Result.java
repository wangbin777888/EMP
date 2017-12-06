package com.tujia.Emp.entity;

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result(int code, java.lang.String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
