package com.roman14.springbootpt.main.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainRestController
{

  @Operation(summary = "Hello", description = "swagger 3 example")
  @GetMapping("/hello")
  public String hwlloWorld()
  {
    return "Hello World!";
  }

  @Operation(summary = "Exception", description = "commong internal server exception occured")
  @GetMapping("/exception")
  public String exceptionOcc() throws Exception
  {
    throw new Exception("this is error message");
  }

}
