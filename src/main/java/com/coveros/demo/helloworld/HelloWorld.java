package com.coveros.demo.helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    private static final Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main(final String[] args) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
        final LocalDateTime now = LocalDateTime.now();

        logger.info("Hello, World! The current time is " + dtf.format(now));
    }
}
