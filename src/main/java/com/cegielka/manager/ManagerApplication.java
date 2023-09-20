package com.cegielka.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagerApplication {

    private static final Logger logger = LoggerFactory.getLogger(ManagerApplication.class);

    public static void main(String[] args) {
        logger.info("running");
        SpringApplication.run(ManagerApplication.class, args);
    }

}
