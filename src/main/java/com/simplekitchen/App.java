package com.simplekitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.simplekitchen")
class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
