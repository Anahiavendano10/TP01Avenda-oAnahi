package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Mes {

	private int Mes;
	public Mes() {
		// TODO Auto-generated constructor stub
	}
	public int getMes() {
		return Mes;
	}
	public void setMes(int mes) {
		Mes = mes;
	}
	public Mes(int mes) {
		super();
		Mes = mes;
	}
	
	public String resultadoMes() {
		String esmes="NO corresponde a un mes";
		
		if(this.Mes>0 && this.Mes<13) {
			esmes="SI corresponde a un mes del anio";
		}
		
		return esmes;
	}
}
