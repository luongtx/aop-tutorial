package com.luongtx.tutorial.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {
    private final Authenticator authenticator = new Authenticator();

    @Pointcut("execution(* com.luongtx.tutorial.aop.MessageCommunicator.*(..))")
    public void secureAccess() {}

    @Before("secureAccess()")
    public void before() {
       authenticator.authenticate();
    }
}
