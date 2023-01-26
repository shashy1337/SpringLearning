package ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Helper;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =
               {"ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Services",
               "ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Repositories",
               "ru.shashy.springVerV2.TestByCleanSpringExampleFromBook.Proxies"})
public class ProjectConfig {

}