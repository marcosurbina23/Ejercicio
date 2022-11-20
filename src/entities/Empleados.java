package entities;

import java.util.Date;

public class Empleados extends Persona {
	private Date ingresoFacultad = new Date();
	private int despachoAsignado;
	private Profesores profesor;
	private String administrativo;
	private Servicio servicio;
	
    
	/***
	 * Empleado de Servicio
	 */

	public Empleados(String nombre, String apellido,int despachoAsignado, int edad, int numIdentificador, EstadoCivil estadoCivil,
			Servicio servicio, Date ingresoFacultad) {
		super(nombre, apellido, edad, numIdentificador, estadoCivil);
		this.despachoAsignado= despachoAsignado;
		this.ingresoFacultad= ingresoFacultad;
		this.servicio = servicio;
	}
	/**
	 * Empleado Profesor
	 * 	 * */

	public Empleados(String nombre, String apellido,int despachoAsignado, int edad, int numIdentificador, EstadoCivil estadoCivil,
			Profesores profesor,Date ingresoFacultad) {
		super(nombre, apellido, edad, numIdentificador, estadoCivil);
		this.despachoAsignado= despachoAsignado;
		this.ingresoFacultad= ingresoFacultad;
		this.profesor = profesor;
	
	}
	
	
	/**
	 * Empleado personal Administrativo
	 * */
	
	public Empleados(String nombre, String apellido,int despachoAsignado, int edad, int numIdentificador, EstadoCivil estadoCivil,
			String administrativo,Date ingresoFacultad
			) {
		super(nombre, apellido, edad, numIdentificador, estadoCivil);
		this.despachoAsignado= despachoAsignado;
		this.ingresoFacultad= ingresoFacultad;
		this.administrativo = administrativo;
		}
	
	
	public int getDespachoAsignado() {
		return despachoAsignado;
	}

	public Profesores getProfesor() {
		return profesor;
	}

	
	public String getAdministrativo() {
		return administrativo;
	}
	public void setAdministrativo(String administrativo) {
		this.administrativo = administrativo;
	}
	public Servicio getServicio() {
		return servicio;
	}
	@Override
	public String toString() {
		return "Empleados [ingresoFacultad=" + ingresoFacultad + ", despachoAsignado=" + despachoAsignado
				+ ", profesor=" + profesor + ", administrativo=" + administrativo + ", servicio=" + servicio + "]";
	}
	
	




}


	
	
	
	
	
