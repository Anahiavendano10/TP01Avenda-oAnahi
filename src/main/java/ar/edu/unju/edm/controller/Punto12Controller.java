package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Caida;

@Controller
public class Punto12Controller {

	@Autowired
	Caida nuevaCaida;
	
	@GetMapping("/resultadoCaida")
	public String getCaidaPage(@RequestParam (name = "num1") int num1, Model model ) {
		
		String resultadoC = "";

		nuevaCaida.setAltura(num1);

		resultadoC = nuevaCaida.resultadoCaida();
		model.addAttribute("resultadoC", resultadoC); //mostrar en la pagina web
		model.addAttribute("numero", num1);
		
		return "resultadoCaida";
	}
}
