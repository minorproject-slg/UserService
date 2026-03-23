package com.minor_project.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.minor_project.repository.StudentRepository;




@SpringBootApplication(scanBasePackages = "com.minor_project")
@EnableJpaRepositories(basePackages = "com.minor_project.repository")
@EntityScan(basePackages = "com.minor_project.entity")
public class UserServiceApplication {

    @Autowired
    StudentRepository userInformationRepository;
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

  
}
