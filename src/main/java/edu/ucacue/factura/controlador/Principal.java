package edu.ucacue.factura.controlador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.ucacue.factura.infraestructura.repositorio.PersonaRepository;
import edu.ucacue.factura.modelo.Persona;

@Controller
public class Principal {

	@Autowired
	PersonaRepository personaRepository;
	
	
	public void insertarPersona() {
		
		 System.out.print("hola");
		 
		Persona p = new Persona(1," juan pablo "," andrango ", "783783783", "127738783");
		personaRepository.save(p ); 
		
		 
		
		/*List<Persona> personas = personaRepository.findAll();
		
		for (Persona p : personas) {
		
			System.out.println(p.getNombre() + " " + p.getApellido());
			
		}*/
		
		Persona encontrado= personaRepository.findByCedula("534534534");
		System.out.println(encontrado);
	}
				
			}

	
	
	

