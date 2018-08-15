package com.example;

import norm.Norm;
import norm.support.spring.NormScannerConfigurer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {



    @Bean
    public Norm norm(DataSource dataSource){
        Norm norm = new Norm();
        norm.setShowSql(true);
        norm.setDataSource(dataSource);
        return norm;
    }

    @Bean
    public NormScannerConfigurer scannerConfigurer(){
        NormScannerConfigurer normScannerConfigurer = new NormScannerConfigurer();
        normScannerConfigurer.setNormBeanName("norm");
        normScannerConfigurer.setBasePackage("com.example.dao");
        return normScannerConfigurer;
    }

}
