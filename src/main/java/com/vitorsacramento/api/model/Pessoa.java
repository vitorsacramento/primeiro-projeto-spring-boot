package com.vitorsacramento.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {

	private Long id;
	private String nome;
	private Integer idade;
	private String email;
	private String telefone;
}
