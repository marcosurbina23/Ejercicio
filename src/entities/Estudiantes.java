package entities;

public class Estudiantes extends Persona {
	private Materia materia;

	public Estudiantes(String nombre, String apellido, int edad, int numIdentificador, EstadoCivil estadoCivil,
			Materia materia) {
		super(nombre, apellido, edad, numIdentificador, estadoCivil);
		this.materia = materia;
	}
	
   public void mostrarDatos() {
	   System.out.println(" Nombre:"+getNombre()+" Apellido:"+getApellido()+" Edad: "+getEdad()+ "Numero de indentificador"+
       getNumIdentificador()+"Estado Civil: "+getEstadoCivil()+"Materia a Cursar: "+getMateria());
   }
	Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	
}