package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.app")
@PropertySource("classpath:app.properties")
public class AppConfig {
	@Autowired
  private Environment env;
	@Bean
	public InternalResourceViewResolver irvs() {
		InternalResourceViewResolver ir=new InternalResourceViewResolver();
		ir.setPrefix(env.getProperty("mvc.prefix"));
		ir.setSuffix(env.getProperty("mvc.suffix"));
		return ir;
		
	}
}
