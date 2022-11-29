package com.luongtx.tutorial.aop;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Authenticator {
    public void authenticate() {
//        System.out.println("Checking and authenticating user ...");
        log.info("Checking and authenticating user ...");
    }
}
