package com.lol.sion.core.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

/**
 * Created by songshuang on 17/2/16.
 */
//@Configuration
public class MyBatisMapperScannerConfig {
    @Bean
    public  MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //获取之前注入的beanName为sqlSessionFactory的对象
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        mapperScannerConfigurer.setBasePackage("com.lol.sion.core.dao.mapper.ext");
        return mapperScannerConfigurer;
    }
}
