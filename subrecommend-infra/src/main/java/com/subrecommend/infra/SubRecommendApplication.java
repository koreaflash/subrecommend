package com.subrecommend.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.subrecommend.biz", "com.subrecommend.infra"})
@EntityScan("com.subrecommend.infra.out.entity")
//@EnableJpaRepositories("com.subrecommend.infra.out.repo")
public class SubRecommendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubRecommendApplication.class, args);
    }
}