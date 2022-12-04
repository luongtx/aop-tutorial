package com.luongtx.tutorial.aop;

public interface Deliverable {
    void deliver(String message);

    void deliver(String recipient, String message);
}
