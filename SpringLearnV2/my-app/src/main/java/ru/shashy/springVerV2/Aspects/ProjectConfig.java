package ru.shashy.springVerV2.Aspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ru.shashy.springVerV2.Aspects")
@EnableAspectJAutoProxy
public class ProjectConfig {
    
    @Bean
    public LoggerAspect loggerAspect(){
        return new LoggerAspect();
    }
}