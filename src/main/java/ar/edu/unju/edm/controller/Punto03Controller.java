package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Par;

@Controller
public class Punto03Controller {
	
	@Autowired
	Par nuevoPar;
	
	@GetMapping("/resultadoPar")
	public String getParPage(@RequestParam (name = "num1") int num1, Model model ) {
		
		String resultadoP = "";

		nuevoPar.setPar(num1);

		resultadoP = nuevoPar.resultadoPar();
		model.addAttribute("resultadoP", resultadoP); //mostrar en la pagina web
		model.addAttribute("numero", num1);
		
		return "resultadoPar";
	}
}
