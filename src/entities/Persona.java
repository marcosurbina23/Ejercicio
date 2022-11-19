package entities;

public class Persona {
	private String nombre;
	private int edad;
	private int numIdentificador;
	public EstadoCivil estadoCivil;
	
	public Persona(String nombre, int edad, int numIdentificador, EstadoCivil estadoCivil) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.numIdentificador = numIdentificador;
		this.estadoCivil = estadoCivil;
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
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", numIdentificador=" + numIdentificador
				+ ", estadoCivil=" + estadoCivil + "]";
	}


	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
}