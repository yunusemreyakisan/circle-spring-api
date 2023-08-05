package com.yakisan.demoapifeature.util;

import org.springframework.http.ResponseEntity;

//ResponseBuilder for Custom Response
public class ResponseBuilder {

    //SuccessResponse (TODO: Error dondurmesi gereksiz.)
    public static ResponseEntity<CustomResponse> createSuccessResponse(Object result, String error) {
        CustomResponse response = new CustomResponse(
                result,
                new ResponseStatusInfo(ResponseStatusEnum.SUCCESS, ResponseStatusEnum.SUCCESS.getStatusCode()),
                error
        );
        return ResponseEntity.status(response.getStatus().getStatusCode()).body(response);
    }

    //NotFoundResponse
    public static ResponseEntity<CustomResponse> createNotFoundResponse(String error) {
        CustomResponse response = new CustomResponse(
                ResponseStatusEnum.NOT_FOUND.getStatusName(),
                new ResponseStatusInfo(ResponseStatusEnum.NOT_FOUND, ResponseStatusEnum.NOT_FOUND.getStatusCode()),
                error
        );
        return ResponseEntity.status(response.getStatus().getStatusCode()).body(response);
    }

    //BadRequestResponse
    public static ResponseEntity<CustomResponse> createBadRequestResponse(String error) {
        CustomResponse response = new CustomResponse(
                ResponseStatusEnum.BAD_REQUEST.getStatusName(),
                new ResponseStatusInfo(ResponseStatusEnum.BAD_REQUEST, ResponseStatusEnum.BAD_REQUEST.getStatusCode()),
                error
        );
        return ResponseEntity.status(response.getStatus().getStatusCode()).body(response);
    }


    //UnauthorizedResponse
    public static ResponseEntity<CustomResponse> createUnauthorizedResponse(String error) {
        CustomResponse response = new CustomResponse(
                ResponseStatusEnum.UNAUTHORIZED.getStatusName(),
                new ResponseStatusInfo(ResponseStatusEnum.UNAUTHORIZED, ResponseStatusEnum.UNAUTHORIZED.getStatusCode()),
                error
        );
        return ResponseEntity.status(response.getStatus().getStatusCode()).body(response);
    }
}
