package com.lol;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/2
 */
public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(TestConfig.class);
        ctx.refresh();

        TestB testB = ctx.getBean(TestB.class);
    }
}
