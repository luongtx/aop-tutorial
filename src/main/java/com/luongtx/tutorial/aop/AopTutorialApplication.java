package com.luongtx.tutorial.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopTutorialApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AopTutorialApplication.class, args);
        MessageCommunicator messageCommunicator = context.getBean(MessageCommunicator.class);
        messageCommunicator.deliver("Harry", "having fun");
        messageCommunicator.deliver("wanna learn aspjecj");
    }
}
