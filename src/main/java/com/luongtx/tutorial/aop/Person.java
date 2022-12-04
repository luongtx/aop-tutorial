package com.luongtx.tutorial.aop;

import org.springframework.stereotype.Component;

@Component
public class Person {

    String name;

    Person() {
        this.name = "luong";
    }

    Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
