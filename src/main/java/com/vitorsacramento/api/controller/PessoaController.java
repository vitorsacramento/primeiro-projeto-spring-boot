package com.vitorsacramento.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vitorsacramento.api.model.Pessoa;
import com.vitorsacramento.api.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class PessoaController {
	
	private PessoaRepository pessoaRepository;

	@GetMapping("/pessoas")
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
	
	@GetMapping("/pessoas/{nome}")
	public List<Pessoa> listarPorNome(@PathVariable("nome") String nome) {
		return pessoaRepository.findByNome(nome);
	}
	
	@GetMapping("/pessoas/com/{nome}")
	public List<Pessoa> listarPorNomeCom(@PathVariable("nome") String nome) {
		return pessoaRepository.findByNomeContaining(nome);
	}
	
}
