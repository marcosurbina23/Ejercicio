package entities;



public class Estudiantes extends Persona {
	public Materia[] materias=new Materia[5];
	public  int  contadorMaterias;
	
	public Estudiantes(String nombre, String apellido, int edad, int numIdentificador, EstadoCivil estadoCivil,
			Materia materia) {
		super(nombre, apellido, edad, numIdentificador, estadoCivil);
		this.materias=new Materia[5];
		contadorMaterias=0;
		
	}
	
   public void mostrarDatos() {
	   System.out.println(" Nombre:"+getNombre()+" Apellido:"+getApellido()+" Edad:"+getEdad()+ " Numero de indentificador: "+
       getNumIdentificador()+" Estado Civil:"+getEstadoCivil()+" Materia a Cursar: "+ getMaterias());
   }
   
   public boolean agregaMateria(Materia m) {
	   if(this.contadorMaterias<5) {
		   materias[contadorMaterias]=m;
		   contadorMaterias++;
		   return true;
	   }else {return false;}
   }
   public void MuestraMaterias() {
	   mostrarDatos();
	   System.out.println(" Tus materias son: ");
	   for (int i =0; i<contadorMaterias; i++) {
		   materias[i].muestradatos();
	   }
   }
   

public Materia[] getMaterias() {
	return materias;
}


	
   


}

