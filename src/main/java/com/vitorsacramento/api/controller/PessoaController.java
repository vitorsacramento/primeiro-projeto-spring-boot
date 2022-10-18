package com.vitorsacramento.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitorsacramento.api.model.Pessoa;

@RestController
public class PessoaController {
	
	@PersistenceContext
	private EntityManager em;

	@GetMapping("/pessoas")
	public List<Pessoa> listar() {
		return em.createQuery("FROM Pessoa", Pessoa.class).getResultList();
	}
}
