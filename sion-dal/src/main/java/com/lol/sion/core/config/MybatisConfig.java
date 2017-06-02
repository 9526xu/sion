package com.lol.sion.core.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/1
 */
@Slf4j
@EnableTransactionManagement
public class MybatisConfig {

    @Autowired
    DataSource dataSource;

   // @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    //@Bean(name = "sqlSessionFactoryBean")
    public SqlSessionFactoryBean sqlSessionFactoryBean() {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
//        <property name="dataSource" ref="dataSource"/>
//        <!-- 加载dal和biz中的mapper.xml文件 -->
//        <property name="mapperLocations" value="classpath:mybatis/**/*Mapper.xml"/>
//        <!-- 同一个model -->
//        <property name="typeAliasesPackage" value="com.saab.finance.core.dao.dataobject.***"/>
//        <property name="transactionFactory" ref="springManagedTransactionFactory"/>
//        <property name="failFast" value="true"/>
        try {
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            bean.setMapperLocations(resolver.getResources("classpath*:/mybatis/**/*Mapper.xml"));
            bean.setTypeAliasesPackage("com.lol.sion.core.dao.dataobject.***");
            return bean;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("初始化SqlSessionFactory失败", e);
            throw new RuntimeException(e);
        }

    }

    //@Bean(name = "mapperScanner")
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScanner = new MapperScannerConfigurer();
        mapperScanner.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        mapperScanner.setBasePackage("com.lol.sion.core.dao.mapper");
        return mapperScanner;
    }

}
