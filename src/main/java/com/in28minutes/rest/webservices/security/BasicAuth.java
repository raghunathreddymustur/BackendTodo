package com.in28minutes.rest.webservices.security;

public class BasicAuth {
    private String msg;

    public BasicAuth(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BasicAuth [msg=" + msg + "]";
    }
    
}
