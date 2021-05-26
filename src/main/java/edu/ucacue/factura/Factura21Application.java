package edu.ucacue.factura;

import java.io.FileNotFoundException;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import edu.ucacue.factura.controlador.Principal;

@SpringBootApplication
public class Factura21Application {

	public static void main(String[] args) throws FileNotFoundException {
		//SpringApplication.run(Factura21Application.class, args);
		
		ConfigurableApplicationContext context = new SpringApplicationBuilder(Factura21Application.class)
		.headless(false)
		.web(WebApplicationType.NONE)
		.run(args);
		Principal p = context.getBean(Principal.class);
		p.insertarPersona();
	}
		
		
		
	}


