package entities;

public class Materia {
	
	public String nombre;

	
	public Materia(String nombre) {
		this.nombre = nombre;
		
	}
	
	 public void muestradatos() {
		 System.out.println(" Materia: " +this.nombre);
	 }

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + "]";
	}
	 
	 	
	

	
	
	
	
}
