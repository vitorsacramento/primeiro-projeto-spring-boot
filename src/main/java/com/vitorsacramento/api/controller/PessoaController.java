package com.vitorsacramento.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
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
}
