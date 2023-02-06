package ru.shashy.springVerV2.AspectsWithArgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ru.shashy.springVerV2.AspectsWithArgs")
@EnableAspectJAutoProxy
public class ProjectConfig {

}