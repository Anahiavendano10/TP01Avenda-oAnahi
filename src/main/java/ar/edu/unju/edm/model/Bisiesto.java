package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Bisiesto {

	private int anio;
	public Bisiesto() {
		// TODO Auto-generated constructor stub
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Bisiesto(int anio) {
		super();
		this.anio = anio;
	}
	
	public String resultadoBisiesto() {
		
		if((this.anio%4 == 0) && ((this.anio%100 != 0) || (this.anio%400 == 0)))
			return "SI es un anio bisiesto";
		else
			return "NO es un anio bisiesto";
	}
}
