package org.example.demo14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Main14 {
    public static void main(String[] args) {
        SpringApplication.run(Main14.class, args);
    }
}