package com.roman14.springbootpt.common.response;

import lombok.Builder;
import lombok.Data;

@Data
public class ResponseWrapper<T>
{
  private int status;
  private String message;
  private T data;

  @Builder
  public ResponseWrapper(int status, String message, T data)
  {
    this.status = status;
    this.message = message;
    this.data = data;
  }
}
