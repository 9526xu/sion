package com.lol.sion.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/8/10
 */
@SpringBootApplication(scanBasePackages = "com.lol.sion")
public class SionCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SionCoreApplication.class, args);
    }
}
