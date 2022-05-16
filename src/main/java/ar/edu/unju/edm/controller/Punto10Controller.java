package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.While;

@Controller
public class Punto10Controller {

	@GetMapping("/resultadoWhile")
	public String getWhilePage(Model model ) {
		
		While nuevaEswhile = new While();
		
		model.addAttribute("resultadoWhile", nuevaEswhile.resultadoWhile()); //mostrar en la pagina web
		return "resultadoWhile";
	}
}
