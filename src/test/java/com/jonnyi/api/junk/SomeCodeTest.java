package com.jonnyi.api.junk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeCodeTest {

    @Test
    void test() {
        var oneMore = new SomeCode("myId");

        assertTrue(oneMore.doSomething().contains("myId"));

        assertSame(oneMore.getId(), "myId");

        assertTrue(oneMore.toString().contains("myId"));
    }
}
