package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Secuencia;

@Controller
public class Punto08Controller {

	@Autowired
	Secuencia nuevaSecuencia;
	
	@GetMapping("/resultadoSecuencia")
	public String getSecuenciaPage(@RequestParam (name = "num1") int num1, Model model ) {
		
		String resultadoS = "";

		nuevaSecuencia.setNumero(num1);

		resultadoS = nuevaSecuencia.resultadoSecuencia();
		model.addAttribute("resultadoS", resultadoS); //mostrar en la pagina web
		model.addAttribute("numero", num1);
		
		return "resultadoSecuencia";
	}
}
