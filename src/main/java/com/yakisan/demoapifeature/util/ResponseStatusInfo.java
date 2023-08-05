package com.yakisan.demoapifeature.util;

public class ResponseStatusInfo {
    private ResponseStatusEnum status;
    private int statusCode;

    public ResponseStatusInfo(ResponseStatusEnum status, int statusCode) {
        this.status = status;
        this.statusCode = statusCode;
    }

    // Getters and setters

    public ResponseStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ResponseStatusEnum status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}