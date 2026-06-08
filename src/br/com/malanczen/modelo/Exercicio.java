package br.com.malanczen.modelo;

import br.com.malanczen.enums.GrupoMuscular;

public class Exercicio {
	//===========Atributos===========
	private String nome;
	private GrupoMuscular grupoMuscular;
	

	//===========Construtor===========
	public Exercicio(String nome, GrupoMuscular grupoMuscular) {
		super();
		this.nome = nome.toUpperCase();
		this.grupoMuscular = grupoMuscular;
	}
	
	//===========Getters e Setters===========
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}


	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}


	public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}
	
	
	
}
