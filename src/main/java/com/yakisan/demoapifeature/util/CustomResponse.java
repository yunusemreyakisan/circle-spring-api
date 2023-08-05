package com.yakisan.demoapifeature.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomResponse {
    private Object result;
    private ResponseStatusInfo status;
    private String error;

    public CustomResponse(Object result, ResponseStatusInfo status, String error) {
        this.result = result;
        this.status = status;
        this.error = error;
    }
}
