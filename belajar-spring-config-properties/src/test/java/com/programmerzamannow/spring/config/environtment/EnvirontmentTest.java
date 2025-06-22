package com.programmerzamannow.spring.config.environtment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class EnvirontmentTest {

    @Autowired
    private Environment environment;

    @Test
    void testEnvirontment() {
        String javaHome = environment.getProperty("JAVA_HOME");

        Assertions.assertEquals("C:\\Program Files\\Java\\jdk-21", javaHome);
    }

    @SpringBootApplication
    public static class TestAppliction {

    }
}
