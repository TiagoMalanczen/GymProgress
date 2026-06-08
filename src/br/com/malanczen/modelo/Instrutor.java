package br.com.malanczen.modelo;

import br.com.malanczen.enums.Especialidades;

public class Instrutor extends Usuario{

	//===========Atributos===========
	private String cref;
	private Especialidades especialidade;
	
	//===========Construtor===========
	public Instrutor(String nome, String dataMatricula, String cref, Especialidades especialidade) {
		super(nome, dataMatricula);
		this.cref = cref;
		this.especialidade = especialidade;
	}

	//===========Getters e Setters===========
	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	public Especialidades getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidades especialidade) {
		this.especialidade = especialidade;
	}
}
