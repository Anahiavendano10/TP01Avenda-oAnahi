package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.For;

@Controller
public class Punto09Controller {
	
	@GetMapping("/resultadoFor")
	public String getForPage(Model model ) {
		
		For nuevaEsfor = new For();
		
		model.addAttribute("resultadoFor", nuevaEsfor.resultadoFor()); //mostrar en la pagina web
		
		return "resultadoFor";
	}
}
