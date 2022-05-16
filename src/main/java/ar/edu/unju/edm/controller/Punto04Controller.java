package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Mes;

@Controller
public class Punto04Controller {
	
	@Autowired
	Mes nuevoMes;
	
	@GetMapping("/resultadoMes")
	public String getMesPage(@RequestParam (name = "num1") int num1, Model model ) {
		
		String resultadoM = "";

		nuevoMes.setMes(num1);

		resultadoM = nuevoMes.resultadoMes();
		model.addAttribute("resultadoM", resultadoM); //mostrar en la pagina web
		model.addAttribute("numero", num1);
		
		return "resultadoMes";
	}
}
