package com.luongtx.tutorial.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Authenticator {
    public static final Logger log = LoggerFactory.getLogger(Authenticator.class);
    public void authenticate() {
//        System.out.println("Checking and authenticating user ...");
        log.info("\nChecking and authenticating user ...");
    }
}
