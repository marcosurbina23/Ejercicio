package test;

import java.util.Date;

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
	Persona persona1=new Persona(" Marcos","Sarmiento",25,01,EstadoCivil.CASADO);
	System.out.println(persona1);
	System.out.println();
	
	//TESTEO CLASE PERSONA 2 CAMBIO DE ESTADO CIVIL
	
	System.out.println("-- Clase persona2 CAMBIO DE ESTADO CIVIL-- ");
	Persona persona2=new Persona(" Paula","Perez", 24, 16,EstadoCivil.CASADA);
	System.out.println(persona2);
	System.out.println();
	
	persona2.setEstadoCivil(EstadoCivil.SOLTERA);
	
	System.out.println(persona2);
	System.out.println();
	
	//TESTEO MATERIA
	System.out.println("--Clase materia --");
	Materia m1= new Materia("matematica");
	m1.muestradatos();
	System.out.println();
	
    // TESTEO ESTUDIANTE
	
	System.out.println("-- Clase Estudiante-- ");
	Estudiantes estudiante1=new Estudiantes("Saul","Goodman", 32, 405,EstadoCivil.DIVORCIADO,m1);
	estudiante1.mostrarDatos();;
	System.out.println();
	
	Estudiantes estudiante2=new Estudiantes("Gabriel"," Montoya", 25, 402, EstadoCivil.SOLTERO,m1);
	estudiante2.mostrarDatos();
	System.out.println();
	
	// TESTEO PROFESOR
	System.out.println("-- Clase Profesor-- ");
	Profesores profesor1=new Profesores("Erick"," Martininez", 24,401,EstadoCivil.SOLTERO,Departamento.INGENIERIAS);
	profesor1.mostrarDatos();
	System.out.println();
	
	// CAMBIO DE MATERIA PROFESOR
	profesor1.setDepartamento(Departamento.ECONOMICAS);
	profesor1.mostrarDatos();
	System.out.println();
	
	//TESTEO SERVICIO
	
	System.out.println("-- Clase Persona de Servicio-- ");
	Servicio servicio1=new Servicio(" Julian "," Ramirez", 45, 208,EstadoCivil.DIVORCIADO,Lugardetrabajo.BIBLIOTECA);
	servicio1.mostrarDatos();;
	System.out.println();
	
	//CAMBIO DE LUGAR DE TRABAJO
	
	Servicio servicio2=new Servicio(" Paola"," Montero", 23, 201,EstadoCivil.DIVORCIADA,Lugardetrabajo.PATIO);
	servicio2.mostrarDatos();
	servicio2.setLugardetrabajo(Lugardetrabajo.BIBLIOTECA);
	System.out.println();
	
	// TESTEO EMPLEADO
	System.out.println("-- Clase Empleado-- ");
	
	Empleados empleado1=new Empleados(" Daniel" , " Ortega",201,45,201,EstadoCivil.CASADO,profesor1,new Date(116,5,3));
	System.out.println(empleado1);
	System.out.println();
	
	Empleados empleado2=new Empleados("Juliana"," Ortiz",500,25,4044,EstadoCivil.CASADA,servicio1,new Date(122,10,21));
	System.out.println(empleado2);
	
	
}}
