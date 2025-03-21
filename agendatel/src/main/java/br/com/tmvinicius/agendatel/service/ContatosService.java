package br.com.tmvinicius.agendatel.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.tmvinicius.agendatel.model.Contato;
import br.com.tmvinicius.agendatel.repository.ContatosRepo;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ContatosService {

	private final ContatosRepo contatorepo;

	public List<Contato> getAllContato() {
		List<Contato> lista = (List<Contato>) contatorepo.findAll();
		lista.sort((c1,c2) -> c1.getNome().compareTo(c2.getNome()));
		return lista;
	}
	
	public List<Contato> getAllContatoByData() {
		List<Contato> lista = (List<Contato>) contatorepo.findAll();
		lista.sort((c1,c2) -> c2.getDataRegistro().compareTo(c1.getDataRegistro()));
		return lista;
	}

	public Contato addNewContato(Contato ct) {
		ct.setNome(ct.getNome().toLowerCase());
		ct.setNumeroCel("(" + ct.getDdd() + ")" + ct.getNumeroCel().toString().substring(0, 1) + " "
				+ ct.getNumeroCel().toString().substring(1, 5) + "-" + ct.getNumeroCel().toString().substring(5));

		ct.setDataRegistro(LocalDateTime.now());

		return contatorepo.save(ct);
	}

	public Contato findByNome(String nome) {
		return contatorepo.findByNome(nome);
	}
	
	public Optional<Contato> findById(Integer id) {
		return contatorepo.findById(id);
	}
	
	public void removeContato(Contato ctt) {
		contatorepo.delete(ctt);
	}
	
}
