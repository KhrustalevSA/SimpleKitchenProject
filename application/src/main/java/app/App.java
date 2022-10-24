package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.simplekitchen.clientmanager", "com.simplekitchen.dto"})
class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
