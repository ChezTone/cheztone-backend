package org.cheztone.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@EnableMongoRepositories(basePackages = "org.cheztone.backend.repository")
@ComponentScan(basePackages = {"org.cheztone.backend"})
public class WebMvcConfig extends WebMvcConfigurerAdapter {


}
