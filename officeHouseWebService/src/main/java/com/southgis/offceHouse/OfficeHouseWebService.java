package com.southgis.offceHouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
//@EnableDiscoveryClient//服务发现
public class OfficeHouseWebService {
    public static void main(String[] args) {
        SpringApplication.run(OfficeHouseWebService.class, args);
    }
}
