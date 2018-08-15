package com.example;

import norm.Norm;
import norm.support.mybatis.MyMapperScannerConfigurer;
import norm.support.spring.NormScannerConfigurer;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class DataSourceConfiguration {



    @Bean
    public Norm norm(DataSource dataSource){
        Norm norm = new Norm();
        norm.setShowSql(true);
        norm.setDataSource(dataSource);
        return norm;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean(ApplicationContext context,DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(context.getResource("classpath:sql-map-config.xml"));
        sqlSessionFactoryBean.setMapperLocations(context.getResources("classpath*:/mapper/*.xml"));
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public MyMapperScannerConfigurer mapperScannerConfigurer(){
        MyMapperScannerConfigurer configurer = new MyMapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        configurer.setBasePackage("com.example");
        configurer.setNormBeanName("norm");
        return configurer;
    }

}
