package com.lol;

import lombok.Data;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/2
 */
@Data
public class TestB {

    private TestA testA;

    public TestB() {
        System.out.println("B test.....");
    }
}
