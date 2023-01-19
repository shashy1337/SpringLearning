package ru.shashy.springlearn.StereotypeAnnotationExample;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.shashy.springlearn.StereotypeAnnotationExample")
public class ProjectConfig {

}