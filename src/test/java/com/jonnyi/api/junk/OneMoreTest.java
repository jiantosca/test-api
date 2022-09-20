package com.jonnyi.api.junk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneMoreTest {

    @Test
    void test() {
        var oneMore = new OneMore("myId");

        assertTrue(oneMore.doSomething().contains("myId"));
    }
}
