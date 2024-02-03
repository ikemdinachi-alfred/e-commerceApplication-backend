package com.alfredtech.ecormerceapplication.util;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Builder
@Data
public class ApiResponse {
    private HttpStatus httpStatus;
    private int statusCode;
    private boolean isSuccessful;
    private Object data;



    public static ApiResponse create(Object data) {
        return ApiResponse.builder()
                .data(data)
                .httpStatus(HttpStatus.CREATED)
                .statusCode(HttpStatus.CREATED.value())
                .isSuccessful(true)
                .build();
    }
}



