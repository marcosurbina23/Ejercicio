package entities;

public class Servicio extends Persona {
	
	private Lugardetrabajo lugardetrabajo;
	
	public Servicio(String nombre, String apellido, int edad, int numIdentificador, EstadoCivil estadoCivil,
			Lugardetrabajo lugardetrabajo) {
		super(nombre, apellido, edad, numIdentificador, estadoCivil);
		this.lugardetrabajo = lugardetrabajo;
	}
	
   public void mostrarDatos() {
	   System.out.println(" Nombre:"+getNombre()+" Apellido:"+getApellido()+" Edad: "+getEdad()+ " Numero de indentificador: "+
       getNumIdentificador()+" Estado Civil: "+getEstadoCivil()+" Lugar asignado para trabajar:"+lugardetrabajo);
   }

public void setLugardetrabajo(Lugardetrabajo lugardetrabajo) {
	this.lugardetrabajo = lugardetrabajo;
}

public Lugardetrabajo getLugardetrabajo() {
	return lugardetrabajo;
}
	
 

}
