package com.bridgelabz.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@Slf4j
public class AddressBookBackendApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Addressbook App");
        ApplicationContext context = SpringApplication.run(AddressBookBackendApplication.class, args);
        log.info("Addressbook App Started in {} Environment",context.getEnvironment().getProperty("environment"));
        log.info("Addressbook App started");
    }
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bridgelabz.employeepayrollapp"))
                .build();
    }
}
