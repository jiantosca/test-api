package com.jonnyi.api.junk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SomeCodeTest {

    @Test
    public void test() {
        var oneMore = new SomeCode("myId");

        assertTrue(oneMore.doSomething().contains("myId"));

        assertSame(oneMore.getId(), "myId");

        assertTrue(oneMore.toString().contains("myId"));

    }
}
