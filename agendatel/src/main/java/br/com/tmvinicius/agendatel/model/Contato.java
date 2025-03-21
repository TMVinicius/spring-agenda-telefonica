package br.com.tmvinicius.agendatel.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "nome", length = 255, nullable = false)
	private String nome;

	@Column(name = "numerocel", length = 15, nullable = false)
	private String numeroCel;

	@Column(name = "DDD", length = 3, nullable = false)
	private Integer ddd;

	@Column(name = "endereco", length = 255)
	private String endereco;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	@Column(name = "datar")
	private LocalDateTime dataRegistro;

}
