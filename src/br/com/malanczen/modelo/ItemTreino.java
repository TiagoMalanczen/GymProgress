package br.com.malanczen.modelo;

public class ItemTreino {
	//===========Atributos===========
	private Exercicio exercicio;
	private Integer series;
	private Integer repeticoes;
	
	//===========Construtor===========
	public ItemTreino(Exercicio exercicio, Integer series, Integer repeticoes) {
		super();
		this.exercicio = exercicio;
		this.series = series;
		this.repeticoes = repeticoes;
	}


	//===========Getters e Setters===========
	public Exercicio getExercicio() {
		return exercicio;
	}

	public Integer getSeries() {
		return series;
	}

	public Integer getRepeticoes() {
		return repeticoes;
	}


	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}


	public void setSeries(Integer series) {
		this.series = series;
	}


	public void setRepeticoes(Integer repeticoes) {
		this.repeticoes = repeticoes;
	}
}
