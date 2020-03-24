package com.safetyback.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean("clientRest")
	public RestTemplate registryRestTemplate() {
		return new RestTemplate();
	}

}
