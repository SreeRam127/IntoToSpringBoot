package com.rockCode.sreeram.firstWeek.introductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppleConfig {

    @Bean
    Apple getApple(){
        return new Apple();
    }
}
