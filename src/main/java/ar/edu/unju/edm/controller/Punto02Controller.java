package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Bisiesto;

@Controller
public class Punto02Controller {
	
	@Autowired
	Bisiesto nuevoBisiesto;
	
	@GetMapping("/resultadoBisiesto")
	public String getBisiestoPage(@RequestParam (name = "num1") int num1, Model model ) {
		
		String resultadoB = "";

		nuevoBisiesto.setAnio(num1);

		resultadoB = nuevoBisiesto.resultadoBisiesto();
		model.addAttribute("resultadoB", resultadoB); //mostrar en la pagina web
		model.addAttribute("numero", num1);
		
		return "resultadoBisiesto";
	}
}
