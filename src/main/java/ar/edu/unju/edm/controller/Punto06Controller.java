package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Nota;

@Controller
public class Punto06Controller {
	
	@Autowired
	Nota nuevaNota;
	
	@GetMapping("/resultadoNota")
	public String getNotaPage(@RequestParam (name = "num1") int num1, Model model ) {
		
		String resultadoN = "";

		nuevaNota.setNota(num1);

		resultadoN = nuevaNota.resultadoNota();
		model.addAttribute("resultadoN", resultadoN); //mostrar en la pagina web
		model.addAttribute("numero", num1);
		
		return "resultadoNota";
	}
}