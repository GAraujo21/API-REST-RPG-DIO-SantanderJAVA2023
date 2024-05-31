package me.finalprojectsantanderjava2023;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Final Project Santander Bootcamp Java 2023 - RPG Game")
                        .description("API com uso de springboot desenvolvido para o curso do bootcamp santander")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new License().name("Licença - Gabriel Games").url("http://www.seusite.com.br"))
                        .contact(new Contact().name("Gabriel Araújo").url("http://www.seusite.com.br").email("gabrielimaaraujo@gmail.com")));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springbootweb-public")
                .pathsToMatch("/**")
                .build();
    }
}
