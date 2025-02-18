//configuration class
package com.ak.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages =  "com.ak.sbeans")
public class AppConfig {

	@Bean(name="ldt")
	public LocalDateTime createLDT() {
		return LocalDateTime.now();
	}
}
