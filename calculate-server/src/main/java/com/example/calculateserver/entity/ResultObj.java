package com.example.calculateserver.entity;

public class ResultObj {
    private int result;
    private String port;


    public ResultObj(int result, String port) {
        this.result = result;
        this.port = port;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
