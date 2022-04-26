package com.roman14.springbootpt.common.handler.exception;

import com.roman14.springbootpt.common.response.ResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CommonExceptionHandler
{
  @ExceptionHandler(Exception.class)
  public ResponseEntity<ResponseWrapper<?>> handlerCommonException(Exception e)
  {
    return ResponseEntity
      .internalServerError()
      .body(ResponseWrapper.builder()
        .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
        .message(e.getMessage())
        .data(null)
        .build()
      );
  }
}
