package com.kp.cache.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.any())
				.build()
				.apiInfo(metaData());
	}
	
	private ApiInfo metaData() {
		
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("Spring Boot Rest API")
				.description("Spring Boot REST API for Finle Handling Demo")
				.version("1.0")
				.termsOfServiceUrl("Tearm Of Service")
				.contact(new Contact("Kumar Patil", "Coming Soon", "kmrpatil323@gmail.com"))
				.build();
		
		return apiInfo;
	
	}
	
	
}
