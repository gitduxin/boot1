package com.dx.demo.project.user.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("user")
public class User {
    private String userId;
    private String userName;
    private String password;
}
