package entities;

public class Empleados {
	private Persona persona;
	private int ingresoFacultad;
	private int despachoAsignado;
	private Profesores profesor;
	private String administrativo;
	private Servicio servicio;
	
	/***
	 * Empleado de Servicio
	 */

	public Empleados( int ingresoFacultad, int despachoAsignado, Servicio servicio) {
	
		
		this.ingresoFacultad = ingresoFacultad;
		this.despachoAsignado = despachoAsignado;
		this.servicio = servicio;
	}
	/**
	 * Empleado Profesor
	 * 	 * */

	public Empleados( int ingresoFacultad, int despachoAsignado, Profesores profesor) {
		
	
		this.ingresoFacultad = ingresoFacultad;
		this.despachoAsignado = despachoAsignado;
		this.profesor = profesor;
	
	}
	/**
	 * Empleado personal Administrativo
	 * */
	
	public Empleados(Persona persona, int ingresoFacultad, int despachoAsignado, String administrativo) {
		this.persona=persona;
		this.ingresoFacultad = ingresoFacultad;
		this.despachoAsignado = despachoAsignado;
		this.administrativo = administrativo;
	}
	
	

	public int getIngresoFacultad() {
		return ingresoFacultad;
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
		return "Empleados [ ingresoFacultad=" + ingresoFacultad + ", despachoAsignado="
				+ despachoAsignado + ", profesor=" + profesor + ", administrativo=" + administrativo + ", servicio="
				+ servicio + "]";
	}





}


	
	
	
	
	
