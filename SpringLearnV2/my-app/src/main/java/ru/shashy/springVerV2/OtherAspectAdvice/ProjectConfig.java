package ru.shashy.springVerV2.OtherAspectAdvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ru.shashy.springVerV2.OtherAspectAdvice")
@EnableAspectJAutoProxy
public class ProjectConfig {

}