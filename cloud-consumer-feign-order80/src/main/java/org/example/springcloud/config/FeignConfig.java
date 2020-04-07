package org.example.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {


    @Bean
    Logger.Level feignLoggerLevel() {
        //feign开启详细日志
        return Logger.Level.FULL;
    }
}
