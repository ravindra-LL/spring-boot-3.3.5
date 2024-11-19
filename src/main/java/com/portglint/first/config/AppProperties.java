package com.portglint.first.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class AppProperties {
    private final Auth auth = new Auth();
    private final Cors cors = new Cors();

    @Data
    public static class Auth {
        private String secretKey;
        private long tokenExpiration;
    }

    @Data
    public static class Cors {
        private List<String> allowedOrigins = new ArrayList<>();
        private List<String> allowedMethods = new ArrayList<>();
    }
}