package com.lol.sion.core.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/6/1
 */
@Configuration
@Slf4j
@MapperScan("com.lol.sion.core.dao.mapper")
@EnableTransactionManagement
@EnableConfigurationProperties(DruidDataSourceProperties.class)
public class DruidDBConfig {



    @Bean
    public DataSource dataSource(DruidDataSourceProperties properties) {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(properties.getDriver());
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());

        //configuration
        dataSource.setInitialSize(properties.getInitialSize());
        dataSource.setMinIdle(properties.getMinIdle());
        dataSource.setMaxActive(properties.getMaxActive());
        dataSource.setMaxWait(properties.getMaxWait());
        dataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
        dataSource.setValidationQuery(properties.getValidationQuery());
        dataSource.setTestWhileIdle(properties.isTestWhileIdle());
        dataSource.setTestOnBorrow(properties.isTestOnBorrow());
        dataSource.setTestOnReturn(properties.isTestOnReturn());
        dataSource.setPoolPreparedStatements(properties.isPoolPreparedStatements());
        dataSource.setMaxOpenPreparedStatements(properties.getMaxOpenPreparedStatementPerConnectionSize());
        try {
            dataSource.setFilters(properties.getFilters());
        } catch (SQLException e) {
            log.error("druid configuration initialization filter", e);
        }
        dataSource.setConnectionProperties(properties.getConnectionProperties());
        return dataSource;
    }
}
