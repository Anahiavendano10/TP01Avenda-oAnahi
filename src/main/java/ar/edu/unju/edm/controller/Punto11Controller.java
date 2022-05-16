package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.DoWhile;

@Controller
public class Punto11Controller {

	@GetMapping("/resultadoDoWhile")
	public String getDoWhilePage(Model model ) {
		
		DoWhile nuevaEsdowhile = new DoWhile();
		
		model.addAttribute("resultadoDoWhile", nuevaEsdowhile.resultadoDoWhile()); //mostrar en la pagina web
		
		return "resultadoDoWhile";
	}
}
