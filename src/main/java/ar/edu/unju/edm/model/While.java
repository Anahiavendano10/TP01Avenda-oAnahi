package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class While {

	public While() {
		// TODO Auto-generated constructor stub
	}
	
	public String resultadoWhile() {
		String resultado="";
		int i=320;
		
		while(i>=160) {
			resultado += Integer.toString(i) + " - ";
			i-=20;
		}
		
		return resultado;
	}
}
