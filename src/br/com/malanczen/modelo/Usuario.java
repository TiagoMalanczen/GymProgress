package br.com.malanczen.modelo;

public class Usuario {
	//===========Atributos===========
	protected int id;
	protected String nome;
	protected String dataMatricula;
	
	private static int cont = 1 ;
	//===========Construtor===========

	public Usuario(String nome, String dataMatricula) {
		super();
		this.id = cont;
		cont++;
		this.nome = nome;
		this.dataMatricula = dataMatricula;
	}
	
	//===========Getters e Setters===========
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
}
