package com.luongtx.tutorial.aop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageCommunicator implements Deliverable{

    @Autowired
    Person person;

    public void deliver(String message) {
        person.getName();
        System.out.println(message);
    }

    public void deliver(String recipient, String message) {
        person.setName(recipient);
        System.out.println(recipient + ", " + message);
    }
}
