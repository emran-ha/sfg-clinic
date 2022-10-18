package com.sfgclinic.config;

import com.sfgclinic.datasource.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    DataSource dataSource(@Value("${test.username}") String username, @Value("${test.password}") String password) {
        return new DataSource(username, password);
    }

}
