package com.roman14.springbootpt.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class Swagger2Config
{
  private static final String BASE_PACKAGE = "com.roman14.springbootpt.main.controller";

  @Bean
  public Docket api()
  {
    return new Docket(DocumentationType.OAS_30)
      .useDefaultResponseMessages(false)
      .apiInfo( this.apiInfo() )
      .select()
      .apis( RequestHandlerSelectors.basePackage(BASE_PACKAGE) )
      .paths(PathSelectors.any())
      .build();
  }

  private ApiInfo apiInfo()
  {
    return ApiInfo.DEFAULT;
  }
}
