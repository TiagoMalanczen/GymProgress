package br.com.malanczen.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.malanczen.enums.TipoTreino;

public class Aluno extends Usuario{

	//===========Atributos===========
	private double peso;
	private double altura;
	private List<FichaTreino> fichas;
	
	//===========Construtor===========
	public Aluno(String nome, String dataMatricula, double peso, double altura) {
		super(nome, dataMatricula);
		this.peso = peso;
		this.altura = altura;
		this.fichas = new ArrayList<>();
	}
	
	//===========Metodos===========
	public double calcularIMC(){
		return  (peso/(altura*altura));
	}
	public void adicionarFicha(FichaTreino ficha) {
		this.fichas.add(ficha);
	}
	public FichaTreino buscarFichaTreino(TipoTreino tipo) {
		for(FichaTreino fc: fichas) {
			if(tipo == fc.getTipoTreino()) {
				return fc;
			}
		}
		return null;
	}
	//===========Getters e Setters===========
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public List<FichaTreino> getFichas() {
		return fichas;
	}

	
	
}
