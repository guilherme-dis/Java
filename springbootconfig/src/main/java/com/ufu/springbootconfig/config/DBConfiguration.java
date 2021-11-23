package com.ufu.springbootconfig.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testeDatabaseConnection(){
        System.out.println("db connection");
        System.out.println(driverClassName);
        System.out.println(url);
        return "db connection";
    }
    @Profile("prod")
    @Bean
    public String productionDatabaseConnection(){
        System.out.println("db connection mysql");
        System.out.println(driverClassName);
        System.out.println(url);
        return "produção";

    }


}
