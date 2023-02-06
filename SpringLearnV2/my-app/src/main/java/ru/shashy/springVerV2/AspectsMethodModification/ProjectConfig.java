package ru.shashy.springVerV2.AspectsMethodModification;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ru.shashy.springVerV2.AspectsMethodModification")
@EnableAspectJAutoProxy
public class ProjectConfig {

}