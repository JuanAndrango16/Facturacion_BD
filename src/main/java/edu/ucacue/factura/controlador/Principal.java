package edu.ucacue.factura.controlador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.Scanner;
import edu.ucacue.factura.infraestructura.repositorio.PersonaRepository;
import edu.ucacue.factura.modelo.Persona;

@Controller
public class Principal {

	@Autowired
	PersonaRepository personaRepository;
	private Scanner lec;
	
	
	/*public void insertarPersona() {
		
		 System.out.print("hola");
		 
		Persona p = new Persona(1," juan pablo "," andrango ", "783783783", "127738783");
		personaRepository.save(p ); */
		
		 
		
		/*List<Persona> personas = personaRepository.findAll();
		
		for (Persona p : personas) {
		
			System.out.println(p.getNombre() + " " + p.getApellido());
			
		}*/
		
		/*Persona encontrado= personaRepository.findByCedula("534534534");
		System.out.println(encontrado);*/
	public void GUI() {
		@SuppressWarnings("resource")
		Scanner entradaEscaner = new Scanner(System.in);
		int entradaTeclado;
		do {
			System.out.println("**************MENÚ PRINCIPAL********************* ");
			System.out.println("*                                               * ");                                            
			System.out.println("*         1. Ingresar Persona                   * ");                          
			System.out.println("*         2. Modificar Persona                  * ");
			System.out.println("*         3. Eliminar Persona                   * ");
			System.out.println("*         4. Listar Personas                    * ");
			System.out.println("*         5. Salir                              * ");
			System.out.println("************************************************* "); 
			entradaTeclado = entradaEscaner.nextInt();
			switch (entradaTeclado) {
			case 1:
				//Gererar el objeto Persona pidiendo los datos por teclado
				System.out.println("********************** "); 
				System.out.println("* Ingrese el nombre: *");
				System.out.println("********************** "); 
				String nombre= entradaEscaner.next();
				System.out.println("************************ "); 
				System.out.println("* Ingrese el apellido: * ");
				System.out.println("************************ "); 
				String apellido= entradaEscaner.next();
				System.out.println("********************** "); 
				System.out.println("* Ingrese la cédula: * ");
				System.out.println("********************** "); 
				String cedu= entradaEscaner.next();
				lec = new Scanner(System.in);
		        
			       
		        int c, suma=0, acum, resta=0;
		        
		        for (int i = 0; i < cedu.length()-1; i++) {
		            c=Integer.parseInt(cedu.charAt(i)+"");
		            if(i%2==0){
		                c=c*2;
		                if(c>9){
		                    c=c-9;
		                }
		            }
		            
		            suma=suma+c;
		        }
		        
		        if (suma%10 !=0) {
		            acum=((suma/10)+1)*10;
		            resta=acum-suma;
		        }
		        
		        int ultimo=Integer.parseInt(cedu.charAt(9)+"");
		        
		        if (ultimo==resta) {
		        	 
		            System.out.println("la cédula ingresa es correcta");
		        }else{
		            System.out.println("la cedula es incorrecta");
		        }
		        
		    
				System.out.println("************************ "); 
				System.out.println("* Ingrese el teléfono: * ");
				System.out.println("************************ "); 
				String telefono= entradaEscaner.next();
				
			Persona p1 = new Persona(nombre, apellido, telefono, cedu);
				personaRepository.save(p1);
				
				break;
			case 2:
				//1 Pedir al usuario que persona quiero modificar "Pedir la cédula"
				//2 ENcontrar a la persona por el número de la cédula
				//3 modificar y cambiar los datos
				try {
					System.out.println("*********************************************** "); 
					System.out.println("* Ingrese el nombre de la persona a modificar * ");
					System.out.println("*********************************************** "); 
					 String nombrelaBuscar = entradaEscaner.next();
					 Persona personaRecuperada = (Persona) personaRepository.findByNombre(nombrelaBuscar);
					 System.out.println("********************* "); 
					 System.out.println("* Ingrese el nombre * ");
					 System.out.println("********************* "); 
					 String nomb = entradaEscaner.next();
					 personaRecuperada.setNombre(nomb);
					 System.out.println("********************** "); 
					 System.out.println(" Ingrese el apellido * ");
					 System.out.println("**********************"); 
					 String apel = entradaEscaner.next();
					 personaRecuperada.setApellido(apel);
					 System.out.println("*********************"); 
					 System.out.println("* Ingrese la cedula * ");
					 System.out.println("********************* "); 
					 String cedul = entradaEscaner.next();
					 personaRecuperada.setApellido(cedul);
					 System.out.println("*********************** "); 
					 System.out.println("* Ingrese el telefono * ");
					 System.out.println("***********************"); 
					 
					 String tel = entradaEscaner.next();
					 personaRecuperada.setTelefono(tel);
					 personaRepository.save(personaRecuperada);
					}catch(Exception e) {System.out.println("   ");}
					break;
				
			case 3:
				try {
					System.out.println("Ingrese elnombre que desea eliminar: ");
					String nombreBuscar= entradaEscaner.next();
					
					Persona personaRecuperada= (Persona) personaRepository.findByNombre(nombreBuscar) ;
					personaRepository.delete(personaRecuperada);
					//1 Pedir al usuario que persona quiero modificar "Pedir la cédula"
					//2 ENcontrar a la persona por el número de la cédula
					//3 Eliminar
					}catch(Exception e) {System.out.println("Existe un problema con la cédula ingresada ");}
					break;
			case 4:
					//Buscar todas las personas que están en la BD e imprimir os resultados
				String nombreBuscar= entradaEscaner.next();
				List<Persona> personas= personaRepository.findByNombreLike(nombreBuscar );
				System.out.println(  "Cédula|" +  "\t"  +   "|Nombre|"  +  "\t"  +  "|Apellido|");
				for (Persona persona : personas) {
					System.out.println(persona.getCedula()+" "+ persona.getNombre()+" " + persona.getApellido());
				}
				break;
			case 5:
				System.exit(0);	
				break;

			default:
				break;
			}
		} while (entradaTeclado != 5);

	}

	}
				
			

	
	
	

