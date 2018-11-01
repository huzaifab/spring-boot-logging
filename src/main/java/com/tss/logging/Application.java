package com.tss.logging;
/**
 * @author huzaifa bhavnagri
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("spring-boot-logging Application is started on endpoint http://localhost:9999/logger as default");
    }
}