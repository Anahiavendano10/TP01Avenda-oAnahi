package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Par {

	private int par;
	public Par() {
		// TODO Auto-generated constructor stub
	}
	public int getPar() {
		return par;
	}
	public void setPar(int par) {
		this.par = par;
	}
	public Par(int par) {
		super();
		this.par = par;
	}
	
	public String resultadoPar() {
		String resultado=" no es par";
		
		if (this.par%2==0) {
			resultado=" es par";
		}
		return resultado;
	}
}
