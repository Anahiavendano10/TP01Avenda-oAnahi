package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Nota {

	private int Nota;
	public Nota() {
		// TODO Auto-generated constructor stub
	}
	public int getNota() {
		return Nota;
	}
	public void setNota(int nota) {
		Nota = nota;
	}
	public Nota(int nota) {
		super();
		Nota = nota;
	}
	
	public String resultadoNota() {
		String nota="";
		
		if(this.Nota>=7 && this.Nota<=10) {
			nota="Promociona";
		}else {
			if(this.Nota==6) {
				nota="Regulariza";
			}else {
				if(this.Nota<6 && this.Nota>=1) {
					nota="Desaprueba";
				}else {
					nota="Valor NO Permitido";
				}
			}
		}
		
		return nota;
	}
}