package br.com.tmvinicius.agendatel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tmvinicius.agendatel.model.Contatos;
import br.com.tmvinicius.agendatel.service.ContatosService;
import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class ContatosController {

private final ContatosService service;
	
	@GetMapping("/contatos")
	public List<Contatos> getAllContatos(){
		return service.getAllContatos();
	}
	
	@PostMapping("/contatos")
	public Contatos addContato(@RequestBody Contatos contat){
		return service.addNovoContato(contat);
	}
	
	
	
	
	
	
}
