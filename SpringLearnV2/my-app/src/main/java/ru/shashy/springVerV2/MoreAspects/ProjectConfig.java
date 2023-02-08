package ru.shashy.springVerV2.MoreAspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ru.shashy.springVerV2.MoreAspects")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggerAspect loggerAspect(){
        return new LoggerAspect();
    }

    @Bean
    public SecurityAspect securityAspect(){
        return new SecurityAspect();
    }
}