package ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =
               {"ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Proxies",
               "ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Repositories",
               "ru.shashy.springlearn.AbstractsUsingWithContext.TestByCleanSpringExampleFromBook.Services"})
public class ProjectConfig {

}