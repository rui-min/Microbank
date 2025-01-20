package com.microbank.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.microbank.accounts.controller") })
@EnableJpaRepositories("com.microbank.accounts.repository")
@EntityScan("com.microbank.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title="Accounts microservice REST API Documentation",
				description = "Accounts microservice REST API Documentation",
				version = "v1.0.0",
				contact = @Contact(
						name = "Ray",
						email = "sample@example.com",
						url = "https://"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.apache.org/licenses/LICENSE-2.0"
				)
		),
        externalDocs = @ExternalDocumentation(
                description =  "Accounts microservice REST API Documentation",
				url = "https://"
        )
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
