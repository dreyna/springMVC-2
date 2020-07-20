package pe.edu.upeu.springMVC2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.springMVC2.entity.Escuela;
import pe.edu.upeu.springMVC2.service.EscuelaService;

@RestController
public class EscuelaController {

	@Autowired
	private EscuelaService escuelaService;
	@GetMapping("/")
	public List<Escuela> readAll(){
		return escuelaService.readAll();
	}
}
