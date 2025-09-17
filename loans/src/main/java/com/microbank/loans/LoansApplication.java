package com.microbank.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.microbank.loans.controller") })
@EnableJpaRepositories("com.microbank.loans.repository")
@EntityScan("com.microbank.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "MicroBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ray",
						email = "tutor@microbank.com",
						url = "https://"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "MicroBank Loans microservice REST API Documentation",
				url = "https://"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
