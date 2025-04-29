package com.practiceFalcon.UserCRUDOp.UserService;

import jdk.jfr.Registered;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.VolatileImage;
import java.sql.SQLOutput;

@SpringBootApplication(scanBasePackages = "com.practiceFalcon.UserCRUDOp")
@EntityScan(basePackages = "com.practiceFalcon.UserCRUDOp.UserService.model")
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
}
