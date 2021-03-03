package com.example.demo2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloControllerTest {
    @Test
    public void aaaa3(){
        HelloController a = new HelloController();

        assertThat(a.hello(),is("hello"));
    }

}
