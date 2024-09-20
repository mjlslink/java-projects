package org.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("Starting Product Application");
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new ApplicationStartingListener());
        app.addListeners(new ApplicationEnvironmentPreparedListener());
        app.addInitializers(new ApplicationContextNewInitializer());
        app.addListeners(new ApplicationPreparedListener());
        app.addListeners(new ApplicationReadyListener()vent);
        app.run(args);    }
}
