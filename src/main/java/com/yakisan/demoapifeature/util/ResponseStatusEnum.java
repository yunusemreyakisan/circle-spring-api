package com.yakisan.demoapifeature.util;

public enum ResponseStatusEnum {
    //Status
    SUCCESS("SUCCESS", 200),
    CREATED("CREATED", 201),
    NO_CONTENT("NO_CONTENT", 204),
    BAD_REQUEST("BAD_REQUEST", 400),
    UNAUTHORIZED("UNAUTHORIZED", 401),
    FORBIDDEN("FORBIDDEN", 403),
    NOT_FOUND("NOT_FOUND", 404),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR", 500),
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE", 503),
    GATEWAY_TIMEOUT("GATEWAY_TIMEOUT", 504);

    private final String statusName;
    private final int statusCode;

    ResponseStatusEnum(String statusName, int statusCode) {
        this.statusName = statusName;
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
