package test;

import entities.Departamento;
import entities.Empleados;
import entities.EstadoCivil;
import entities.Estudiantes;
import entities.Lugardetrabajo;
import entities.Materia;
import entities.Persona;
import entities.Profesores;
import entities.Servicio;

public class TesteodeClases {
public static void main(String[] args) {
	
	// TESTEO CLASE PERSONA 
	
	System.out.println("-- Clase Persona-- ");
	Persona persona1=new Persona(" Marcos",25,01,EstadoCivil.CASADO);
	System.out.println(persona1);
	System.out.println();
	
	//TESTEO CLASE PERSONA 2 CAMBIO DE ESTADO CIVIL
	
	System.out.println("-- Clase persona2 -- ");
	Persona persona2=new Persona(" Paula", 24, 16,EstadoCivil.CASADA);
	System.out.println(persona2);
	System.out.println();
	
	persona2.setEstadoCivil(EstadoCivil.SOLTERA);
	
	System.out.println(persona2);
	System.out.println();
	
	
    // TESTEO ESTUDIANTE
	
	System.out.println("-- Clase Estudiante-- ");
	Estudiantes estudiante1=new Estudiantes(Materia.FISICA,persona1);
	System.out.println(estudiante1);
	System.out.println();
	
	Estudiantes estudiante2=new Estudiantes(Materia.MATEMATICA,new Persona(" Daniela", 24, 16,EstadoCivil.VIUDA));
	System.out.println(estudiante2);
	System.out.println();
	
	// TESTEO PROFESOR
	System.out.println("-- Clase Profesor-- ");
	Profesores profesor1=new Profesores(" Erick",Departamento.INGENIERIAS);
	System.out.println(profesor1);
	System.out.println();
	
	// CAMBIO DE MATERIA PROFESOR
	profesor1.setDepartamento(Departamento.ECONOMICAS);;
	System.out.println(profesor1);
	System.out.println();
	
	//TESTEO SERVICIO
	
	System.out.println("-- Clase Persona de Servicio-- ");
	Servicio servicio1=new Servicio(new Persona( " Juan", 32, 41,EstadoCivil.DIVORCIADO),Lugardetrabajo.GYM);
	System.out.println(servicio1);
	System.out.println();
	
	//CAMBIO DE LUGAR DE TRABAJO
	
	Servicio servicio2=new Servicio(new Persona(" Rodrigo", 24, 52,EstadoCivil.CASADO),Lugardetrabajo.SECRETARIA);
	System.out.println(servicio2);
	servicio2.setLugardetrabajo(Lugardetrabajo.BIBLIOTECA);
	System.out.println();
	
	// TESTEO EMPLEADO
	System.out.println("-- Clase Empleado-- ");
	Empleados empleado1=new Empleados(2015,401,profesor1);
	System.out.println(empleado1);
	System.out.println();
	
	Empleados empleado2=new Empleados(2015,404,servicio1);
	System.out.println(empleado2);
	System.out.println();
	
	Empleados empleado3=new Empleados(new Persona(" Andrea",56, 201,EstadoCivil.VIUDA),2015,201," Secretaria");
	System.out.println(empleado3);
	
	
	
}}
