package com.lol.sion.core.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * Created by songshuang on 17/2/16.
 */
public class MyBatisMapperScannerConfig {
    //@Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //获取之前注入的beanName为sqlSessionFactory的对象
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.lol.sion.core.dao.mapper.ext");
        return mapperScannerConfigurer;
    }
}
