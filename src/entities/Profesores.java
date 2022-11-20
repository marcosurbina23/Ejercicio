package entities;

public class Profesores extends Persona {
	
	public String profesor;
	private Departamento departamento;
	
	public Profesores(String nombre, String apellido, int edad, int numIdentificador, EstadoCivil estadoCivil,
			Departamento departamento) {
		super(nombre, apellido, edad, numIdentificador, estadoCivil);
		this.departamento = departamento;
	}
	
   public void mostrarDatos() {
	   System.out.println(" Nombre:"+getNombre()+" Apellido:"+getApellido()+" Edad: "+getEdad()+ " Numero de indentificador: "+
       getNumIdentificador()+" Estado Civil: "+getEstadoCivil()+" Departamento asignado:"+departamento);
   }

public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}
   
}
