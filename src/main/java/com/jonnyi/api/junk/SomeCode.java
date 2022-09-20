package com.jonnyi.api.junk;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
public class SomeCode {

    private String id;

    public String doSomething() {
        var list = List.of("one", "two", "three");
        list.forEach(log::debug);
        return "didSomething for OneMore with id: " + id;
    }
}
