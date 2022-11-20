package entities;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private int numIdentificador;
	public EstadoCivil estadoCivil;
	
	public Persona(String nombre,String apellido ,int edad, int numIdentificador, EstadoCivil estadoCivil) {
		
		this.apellido= apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.numIdentificador = numIdentificador;
		this.estadoCivil = estadoCivil;
	}


	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}



	public int getEdad() {
		return edad;
	}



	public int getNumIdentificador() {
		return numIdentificador;
	}



	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ",apellido= "+ apellido + ", edad=" + edad + ", numIdentificador=" + numIdentificador
				+ ", estadoCivil=" + estadoCivil + "]";
	}


	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}