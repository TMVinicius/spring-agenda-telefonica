package br.com.tmvinicius.agendatel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tmvinicius.agendatel.model.Contato;
import br.com.tmvinicius.agendatel.service.ContatosService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ContatosController {

	private final ContatosService service;

	@GetMapping("/contatos")
	public List<Contato> getAllContatos() {
		return service.getAllContato();
	}

	@GetMapping("/contatos/data")
	public List<Contato> getAllContatosByData() {
		return service.getAllContatoByData();
	}

	@GetMapping("/contato/nome/{Nome}")
	public ResponseEntity<Contato> findContatoByNome(@PathVariable String Nome) {

		Contato ctt = service.findByNome(Nome);
		if (ctt != null) {
			return ResponseEntity.ok().body(ctt);
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/contato/{id}")
	public ResponseEntity<Optional<Contato>> findById(@PathVariable Integer id) {

		Optional<Contato> ctt = service.findById(id);
		if (ctt != null) {
			return ResponseEntity.ok().body(ctt);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/contatos")
	public Contato addContato(@RequestBody Contato contat) {
		return service.addNewContato(contat);
	}

	@DeleteMapping("/contato/{Nome}")
	public ResponseEntity<Contato> removeContato(@PathVariable String Nome) {

		Contato ctt = service.findByNome(Nome);
		if (ctt != null) {
			Contato name = ctt;
			service.removeContato(ctt);
			return ResponseEntity.ok().body(name);
		}
		return ResponseEntity.notFound().build();

	}

}