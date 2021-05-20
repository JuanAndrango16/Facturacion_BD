package edu.ucacue.factura.modelo;

import javax.persistence.Entity;

import javax.persistence.Id;
@Entity


public class Persona {

	
	@Id
	private int id;
	
	
	private String nombre;
	private String apellido;
	private String telefono;
	private String celular;
	
	
	
	
	public Persona(int id, String nombre, String apellido, String telefono, String celular) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.celular = celular;
	}


	public Persona() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
}