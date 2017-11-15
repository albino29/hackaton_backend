package com.hacka.rouze.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hacka.rouze.model.Dica;
import com.hacka.rouze.repository.DicaRepository;

@RestController
@CrossOrigin("${origem-permitida}")
public class DicaResource {

	@Autowired
	DicaRepository dicaRepository;
	
	@GetMapping("/dicas")
	public List<Dica> listar() {
		return dicaRepository.findAll();
	}
	
}
