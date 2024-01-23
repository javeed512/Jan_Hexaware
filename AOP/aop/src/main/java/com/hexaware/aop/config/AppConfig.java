package com.hexaware.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.hexaware.aop")
@EnableAspectJAutoProxy
public class AppConfig {

}
