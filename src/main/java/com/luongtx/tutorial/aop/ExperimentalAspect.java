package com.luongtx.tutorial.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log4j2
public class ExperimentalAspect {

    @Pointcut("execution(com.luongtx.tutorial.aop.Person.new(..))")
    public void constructorExecution() {
    }

    @Pointcut("within(com.luongtx.tutorial.aop.Person)")
    public void personWithin() {

    }

    @Pointcut("this(com.luongtx.tutorial.aop.Deliverable)")
    public void thisDeliverable() {

    }

    @Before("constructorExecution()")
    public void beforeConstructor() {
        System.out.println("before person constructor");
    }

    @Before("personWithin()")
    public void beforePersonWithin(JoinPoint jp) {
        System.out.println("Before each action on person");
    }

    @Before("thisDeliverable()")
    public void beforeThisDeliverable(JoinPoint jp) {
        System.out.println("Before this deliverable");
    }
}
