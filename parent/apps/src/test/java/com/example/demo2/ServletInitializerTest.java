package com.example.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ServletInitializerTest {
    @Test
    public void aaaa(){
        ServletInitializer a = new ServletInitializer();

        a.configure(new SpringApplicationBuilder(){

        });
    }

    @Test
    public void aaaa2(){
        ServletInitializer a = new ServletInitializer();
        assertThat(a.abcd(),is("abc"));
    }
    @Test
    public void aaaa22(){
        ServletInitializer a = new ServletInitializer();
        assertThat(a.abcd2(),is("abc"));
    }

    @Test
    public void aaaa3(){
        ServletInitializer a = new ServletInitializer();
        assertThat(a.abcd3(),is("abc"));
    }

    @Test
    public void aaaa4(){
        ServletInitializer a = new ServletInitializer();
        assertThat(a.abcd4(),is("abc"));
    }

    @Test
    public void aaaa5(){
        ServletInitializer a = new ServletInitializer();
        assertThat(a.abcd5(),is("abc"));
    }
}
