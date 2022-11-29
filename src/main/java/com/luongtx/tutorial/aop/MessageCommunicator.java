package com.luongtx.tutorial.aop;


import org.springframework.stereotype.Component;

@Component
public class MessageCommunicator {
    public void deliver(String message) {
        System.out.println(message);
    }

    public void deliver(String person, String message) {
        System.out.println(person + ", " + message);
    }
}
