package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Secuencia {

	private int Numero;
	public Secuencia() {
		// TODO Auto-generated constructor stub
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public Secuencia(int numero) {
		super();
		Numero = numero;
	}
	
	public String resultadoSecuencia() {
		String resultadoString="";
		int resultadoInteger=1;
		int factorMultiplicador=1;
		
		do {
			
			resultadoInteger = this.Numero * factorMultiplicador;
			factorMultiplicador += 1;
			resultadoString += Integer.toString(resultadoInteger) + " - ";
			
		}while((resultadoInteger+this.Numero) <= 100);
		
		return resultadoString;
	}
}
