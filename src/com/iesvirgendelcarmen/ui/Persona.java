package com.iesvirgendelcarmen.ui;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Persona {
	private String nombre;
	private String apellidos;
	private long telefono;
	private LocalDate fechaNacimiento;
	
	public Persona() {
		this.nombre="";
		this.apellidos="";
		this.telefono=0;
		this.fechaNacimiento=null;
	}
	
	public Persona(String nombre, String apellidos, long telefono, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public long getTelefono() {
		return telefono;
	}
	
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public String getFechaNacimientoString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return this.fechaNacimiento.format(formatter);
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formatter);
	}
	
	public static Persona getInstancia() {
		Persona p = new Persona();
		p.nombre = "Luis";
		p.apellidos = "Molina";
		p.telefono = 666666666;
		p.fechaNacimiento = LocalDate.of(1980, Month.FEBRUARY, 6);
		return p;
	}
}
