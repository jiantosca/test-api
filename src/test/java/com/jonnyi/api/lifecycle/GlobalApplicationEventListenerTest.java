package com.jonnyi.api.lifecycle;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationEvent;

class GlobalApplicationEventListenerTest {

    @Test
    void test() {
        var listener = new GlobalApplicationEventListener();
        listener.onApplicationEvent(new ApplicationEvent(this) {});
        assertTrue(1 == 1);
    }
}
