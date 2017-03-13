package com.agenda.modelo;
// 3º construimos la clase Contacto, la entidas contacto , o el java bean Contacto 
public class Usuario {
	
	private String nombre;
	private String apellido;
	private String edad;
	private String telefono;
	private String ciudad;
	
	public Usuario() {
		//por convenciones... si es una clase java bean siempre se crea un constructor vacio
	}
	
	public Usuario(String nombre, String apellido, String edad,
			String telefono, String ciudad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.ciudad = ciudad;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	

}
