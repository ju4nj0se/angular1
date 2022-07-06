package com.example.angular1.configuration;

import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
	 @Bean
	    public Docket swaggerSpringMvcPlugin() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .groupName("Prueba")
	                .apiInfo(apiInfo())
	                .select()
	                .paths(regex("/.*"))
	                .build();
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("Prueba")
//	                .description("")
//	                .termsOfServiceUrl("http://springfox.io")
	                .contact(new Contact("Juan", "https://google.com", "juan@asdas.com"))
	                .license("MIT")
	                .licenseUrl("http://opensource.org/licenses/MIT")
	                .version("1.0")
	                .build();
	    }

	}