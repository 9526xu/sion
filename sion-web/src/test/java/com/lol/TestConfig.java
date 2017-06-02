package com.lol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/2
 */
@Configuration
public class TestConfig {

    @Bean
    public TestB testB(TestA testA) {
        TestB testB = new TestB();
        testB.setTestA(testA);
        return testB;
    }

    @Bean
    public TestA testA() {
        return new TestA();
    }


}
