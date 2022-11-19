package entities;

public class Profesores {
	
	public String profesor;
	private Departamento departamento;
	
	public Profesores(String profesor, Departamento departamento) {
		
		this.profesor = profesor;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesores [profesor=" + profesor + ", departamento=" + departamento + "]";
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	

	
	

}
