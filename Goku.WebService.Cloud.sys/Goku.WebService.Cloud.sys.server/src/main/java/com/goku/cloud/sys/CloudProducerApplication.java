package com.goku.cloud.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author nbfujx
 * @date 2017-11-24
 */
@SpringBootApplication
@EnableDiscoveryClient
@ServletComponentScan
@MapperScan(basePackages = "com.goku.cloud.sys.mapper")
public class CloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProducerApplication.class, args);
    }
}