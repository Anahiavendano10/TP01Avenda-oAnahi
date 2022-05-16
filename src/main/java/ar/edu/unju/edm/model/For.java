package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class For {

	public For() {
		// TODO Auto-generated constructor stub
	}
	
	public String resultadoFor() {
		String resultado="";
	
		for(int i=320; i>=160; i=i-20) {
			resultado += Integer.toString(i) + " - ";
		}
		
		return resultado;
	}
	
}
