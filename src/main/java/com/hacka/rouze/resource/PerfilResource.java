package com.hacka.rouze.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hacka.rouze.model.Perfil;
import com.hacka.rouze.repository.PerfilRepository;

@RestController
@CrossOrigin("${origem-permitida}")
public class PerfilResource {

	@Autowired
	PerfilRepository perfisRepo;
	
	@PostMapping("/perfil")
	public void salvar(@RequestBody @Valid Perfil perfil) {
		perfisRepo.save(perfil);
		System.out.println("Perfil salvo!");
		
		//return perfisRepo.save(perfil);
	}
	
	@GetMapping("/perfil")
	public List<Perfil> listar(){
		return perfisRepo.findAll();
	}
}
