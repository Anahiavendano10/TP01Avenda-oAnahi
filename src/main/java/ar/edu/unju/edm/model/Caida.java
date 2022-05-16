package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Caida {

	private int Altura;
	public Caida() {
		// TODO Auto-generated constructor stub
	}
	public int getAltura() {
		return Altura;
	}
	public void setAltura(int altura) {
		Altura = altura;
	}
	public Caida(int altura) {
		super();
		Altura = altura;
	}
	
	public String resultadoCaida() {
		double tiempo = Math.sqrt((2*this.Altura)/9.81);
		return Double.toString(tiempo);
	}
}
