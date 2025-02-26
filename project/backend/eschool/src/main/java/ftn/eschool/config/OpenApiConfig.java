package ftn.eschool.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Milos Vlku",
                        email = "milos.vlku.learning@gmail.com",
                        url = "https://www.linkedin.com/in/milos-vlku"
                ),
                description = "OpenApi documentation for Eschool",
                title = "OpenApi specification - Eschool"

        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                )
        }
)
public class OpenApiConfig {
}
