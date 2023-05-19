package ru.shashy.openfeigntesting.conf;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "ru.shashy.openfeigntesting.Proxy")
public class ProjectConfig {}
