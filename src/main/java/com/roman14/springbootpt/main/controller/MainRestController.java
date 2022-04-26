package com.roman14.springbootpt.main.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainRestController
{
  @Operation(summary = "Hello", description = "swagger 3 example")
  @GetMapping("/hello")
  public String hwlloWorld()
  {
    return "Hello World!";
  }
}
