package org.example.olnn;

import org.example.olnn.controller.OlnnController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OlnnApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(OlnnApplication.class, args);
        context.getBean(OlnnController.class).getFileService().display();
    }

}
