package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Factorial {
	//atributos

	private Integer num1;
	
	//constructor
	public Factorial() {
		// TODO Auto-generated constructor stub
	}
	
	//getter and setter
	
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	
	//este es el otro constructor
	
	public Factorial(Integer num1) {
		super();
		this.num1 = num1;
	}
	
	//otros métodos
	
	public int resolverFactorial() {
		int num=1;
		
		for( int i = 1; i <= num1; i++) {
			num*= i;
		}
		return num;
	}
	
}
