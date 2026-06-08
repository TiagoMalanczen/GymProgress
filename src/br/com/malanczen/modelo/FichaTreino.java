package br.com.malanczen.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.malanczen.enums.TipoTreino;

public class FichaTreino {
	//===========Atributos===========
	private TipoTreino tipoTreino;
	private Instrutor instrutorResponsavel;
	private List<ItemTreino> listaItens;
	
	//===========Construtor===========
	public FichaTreino(TipoTreino tipoTreino, Instrutor instrutorResponsavel) {
		super();
		this.tipoTreino = tipoTreino;
		this.instrutorResponsavel = instrutorResponsavel;
		this.listaItens = new ArrayList<>();
	}
	//===========Metodos===========
	public void adicionarItem(ItemTreino item) {
		listaItens.add(item);
	}

	//===========Getters e Setters===========
	public TipoTreino getTipoTreino() {
		return tipoTreino;
	}

	public void setTipoTreino(TipoTreino tipoTreino) {
		this.tipoTreino = tipoTreino;
	}

	public Instrutor getInstrutorResponsavel() {
		return instrutorResponsavel;
	}

	public void setInstrutorResponsavel(Instrutor instrutorResponsavel) {
		this.instrutorResponsavel = instrutorResponsavel;
	}

	public List<ItemTreino> getListaItens() {
		return listaItens;
	}

	public void setListaItens(List<ItemTreino> listaItens) {
		this.listaItens = listaItens;
	}
	
	
}
