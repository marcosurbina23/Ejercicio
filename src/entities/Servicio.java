package entities;

public class Servicio {
	private Persona persona;
	private Lugardetrabajo lugardetrabajo;
	
	public Servicio(Persona persona, Lugardetrabajo lugardetrabajo) {
		this.persona = persona;
		this.lugardetrabajo = lugardetrabajo;
	}

	@Override
	public String toString() {
		return "Servicio [persona=" + persona + ", lugardetrabajo=" + lugardetrabajo + "]";
	}

	public void setLugardetrabajo(Lugardetrabajo lugardetrabajo) {
		this.lugardetrabajo = lugardetrabajo;
	}
	
	
	
	
	
	

}
