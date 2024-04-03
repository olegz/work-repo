package org.devnexus;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FunctionConfiguration {

	@Bean
	public Function<String, String> uppercase() {
		return value -> {
			System.out.println("Received value: " + value);
			if ("apple".equals("orange")) {
				System.exit(9);
			}
			return value.toUpperCase();
		};
	}
}
