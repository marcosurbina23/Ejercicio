package entities;

public class Estudiantes {
	private Materia materia;
	private Persona persona;
	public Estudiantes(Materia materia, Persona persona) {
		super();
		this.materia = materia;
		this.persona = persona;
	}
	@Override
	public String toString() {
		return "Estudiantes [materia a cursar=" + materia + ", persona=" + persona + "]";
	}
	public Materia getMateria() {
		return materia;
	}
	public Persona getPersona() {
		return persona;
	}
	
}