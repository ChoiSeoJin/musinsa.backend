package com.choiseojin.backend.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ResponseDto<T> {
    private HttpStatus statusCode;
    private String msg;
    private T data;

    public ResponseDto() {
        this.statusCode = null;
        this.msg = null;
        this.data = null;
    }
    public ResponseDto(final HttpStatus code, final String msg) {
        this.statusCode = code;
        this.msg = msg;
        this.data = null;
    }

    public static<T> ResponseDto<T> res(final HttpStatus code, final String msg) {
        return res(code, msg, null);
    }


    public static<T> ResponseDto<T> res(final HttpStatus code, final String msg, final T t) {
        return ResponseDto.<T>builder()
                .data(t)
                .statusCode(code)
                .msg(msg)
                .build();
    }
}