package com.jonnyi.api;

import com.jonnyi.api.lifecycle.GlobalApplicationEventListener;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Let's see sonar complain :)");

        // SpringApplication.run(MainApplication.class, args);

        var app = new SpringApplication(MainApplication.class);
        app.addListeners(new GlobalApplicationEventListener());
        var configurableAppCtx = app.run(args);
    }

    @PostConstruct
    void postConstruct() {
        log.info("Entering postConstruct()");
    }
}
