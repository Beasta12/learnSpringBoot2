package com.programmerzamannow.spring.config.appproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest(classes = ApplicationProperitesTest.TestApplication.class)
public class ApplicationProperitesTest {

    @Autowired
    private Environment environment;

    @Test
    void testApplicationProperties() {
        String applicationName = environment.getProperty("spring.application.name");
        Assertions.assertEquals("Belajar aplikasi spring boot", applicationName);
    }

    @SpringBootApplication
    public static class TestApplication {
    }
}
