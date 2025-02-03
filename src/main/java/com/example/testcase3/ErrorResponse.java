package com.example.testcase3;

public class ErrorResponse {
    private String messege;
    private int statusCode;

    public ErrorResponse(String messege, int statusCode) {
        this.messege = messege;
        this.statusCode = statusCode;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
