package com.example.demo.conf;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author guzemin@songxiaocai.com
 * @create 2018-02-26 17:51
 **/
@Configuration
public class DruidDataSourceConf {

    @Bean
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}
