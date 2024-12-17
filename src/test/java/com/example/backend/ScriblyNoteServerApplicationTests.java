package com.example.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import com.example.backend.config.TestSecurityConfig;

@SpringBootTest
@Import(TestSecurityConfig.class)
class ScriblyNoteServerApplicationTests {

    @Test
    void contextLoads() {
    }

}   