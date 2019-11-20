package com.NewsWorkFlw2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
	@Configuration
	@ComponentScan
	public class MyWebConfig {
	  @Bean
	  //had to call this myBeanName because beanNameViewResolver is listed somewhere else. 
	  //I wasn't able to find the location for the BeanNameViewResolver listed somewhere else, is the my neccessary?
	  public ViewResolver myBeanNameViewResolver() {
	      BeanNameViewResolver resolver = new BeanNameViewResolver();
	      return resolver;
	  }

	  @Bean
	  public ViewResolver htmlViewResolver() {
	      InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	      viewResolver.setPrefix("/WEB-INF/views/");
	      viewResolver.setSuffix(".jsp");
	      
	      //really like the set prefix and suffix you have for the view resolver, good way to name jsp's
	      return viewResolver;
	  }
	}

