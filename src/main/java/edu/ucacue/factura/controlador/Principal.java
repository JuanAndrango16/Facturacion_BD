package edu.ucacue.factura.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.ucacue.factura.infraestructura.repositorio.PersonaRepository;
import edu.ucacue.factura.modelo.Persona;

@Controller
public class Principal {

	@Autowired
	PersonaRepository personaRepository;
	
	
	public void insertarPersona() {
		
		 
		 
		Persona p = new Persona(1," juan pablo "," andrango ", "783783783", "127738783");
		personaRepository.save(p ); 
		
			
				
			}
}
	
	
	

