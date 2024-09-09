package com.github.jordanshopapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerApiConfig{
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(
                new Info().title("Jordan Shop API").description("Jordan Shop API")
                .contact(new Contact().name("José Ulisses").email("Contato.ulisses@Gmail.com")).version("1.0")
                .license(new License().name("MIT License").url("https://opensource.org/licenses/MIT")));
    }


}
