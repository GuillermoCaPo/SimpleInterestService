package com.msd.SimpleInterestService.model.rest;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
public class ExceptionResponse {

    private final String message;
    private final HttpStatus status;
    private final List<String> invalidFields;

}
