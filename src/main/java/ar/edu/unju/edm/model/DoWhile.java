package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class DoWhile {

	public String resultadoDoWhile() {
		String resultado="";
		int i=320;
		
		do {
			resultado += Integer.toString(i) + " - ";
			i-=20;
		}while(i>=160);
		
		return resultado;
	}
}
