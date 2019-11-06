package com.hostel;

import config.Initializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sun.applet.Main;

import javax.faces.webapp.FacesServlet;

@Configuration
@ComponentScan(basePackages={""})
@EnableAutoConfiguration
@SpringBootApplication
public class HostelApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HostelApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure
			(SpringApplicationBuilder application) {
		return application.sources(
				new Class[] { HostelApplication.class, Initializer.class});
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		FacesServlet servlet = new FacesServlet();
		ServletRegistrationBean servletRegistrationBean
				= new ServletRegistrationBean(servlet, "*.jsf");
		return servletRegistrationBean;
	}

}
