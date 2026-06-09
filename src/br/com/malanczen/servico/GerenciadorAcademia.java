package br.com.malanczen.servico;

import java.util.ArrayList;
import java.util.List;

import br.com.malanczen.enums.Especialidades;
import br.com.malanczen.enums.GrupoMuscular;
import br.com.malanczen.enums.TipoTreino;
import br.com.malanczen.modelo.Aluno;
import br.com.malanczen.modelo.Exercicio;
import br.com.malanczen.modelo.FichaTreino;
import br.com.malanczen.modelo.Instrutor;
import br.com.malanczen.modelo.ItemTreino;

public class GerenciadorAcademia {
	//===========Atributos===========
	private List<Aluno> alunos;
	private List<Instrutor>instrutores;
	private List<Exercicio> exercicios;
	
	//===========Construtor===========
	public GerenciadorAcademia() {
		this.alunos = new ArrayList<>();
		this.instrutores = new ArrayList<>();
		this.exercicios= new ArrayList<>();
		
	}
	//===========Metodos===========
	public void cadastrarAluno(String nome, String dataMatricula, double peso, double altura) {
		Aluno novoALuno = new Aluno(nome, dataMatricula, peso, altura);
		this.alunos.add(novoALuno);
	}
	
	public void cadastrarInstrutor(String nome, String dataMatricula, String cref , Especialidades especialidade) {
		Instrutor novoInstrutor = new Instrutor(nome, dataMatricula, cref, especialidade);
		this.instrutores.add(novoInstrutor);
	}
	public void cadastrarExercicio(String nome, GrupoMuscular grupoMuscular) {
		Exercicio novoExercicio = new Exercicio(nome, grupoMuscular);
		this.exercicios.add(novoExercicio);
	}
	
	public Aluno buscarAlunoId(int id) {
		for(Aluno al : alunos) {
			if(al.getId() == id) {
				return al;
			}
		}
		return null;
	}
	public Instrutor buscarInstrutorId(int id) {
		for(Instrutor inst : instrutores) {
			if(inst.getId() == id) {
				return inst;
			}
		}
		return null;
	}
	public Exercicio buscarExercicioNome(String nome) {
		for(Exercicio ex : exercicios) {
			if(ex.getNome().equals(nome.toUpperCase().trim())) {
				return ex;
			}
		}
		return null;
	}
	
	public void vincularFichaTreino(int idAluno, int IdInstrutor, TipoTreino treino) {
		Aluno aluno = this.buscarAlunoId(idAluno);
		Instrutor instrutor = this.buscarInstrutorId(IdInstrutor);
		if(aluno == null || instrutor == null) {
			System.out.println("Instrutor ou aluno nao encontrado");
		}
		else {
			FichaTreino novaFicha = new FichaTreino(treino, instrutor);
			aluno.adicionarFicha(novaFicha);
			System.out.println("Ficha "+ treino + " vinculada ao aluno " + aluno.getNome());
		}
	}
	
	public void adicionarExerciciosNaFicha(int idAluno, TipoTreino treino, String nomeExercicio, int series, int repeticoes) {
		Aluno aluno = this.buscarAlunoId(idAluno);
		if(aluno == null) {
			System.out.println("Aluno nao econtrado");
			return;
		}
		Exercicio exercicio = this.buscarExercicioNome(nomeExercicio);
		if(exercicio == null) {
			System.out.println("Exercicio nao encontrado");
			return;
		}
		FichaTreino fichaTreino = aluno.buscarFichaTreino(treino);
		if(fichaTreino == null) {
			System.out.println("Ficha de Treino nao encontrada");
			return;
		}
		
		ItemTreino itemTreino = new ItemTreino(exercicio, series, repeticoes);
		fichaTreino.adicionarItem(itemTreino);
	}
	
	public String gerarRelatorioEvolucao(int idAluno) {
		Aluno aluno = this.buscarAlunoId(idAluno);
		
		if(aluno == null) {
			return "Aluno nao encontrado";
		}
		double imc = aluno.calcularIMC();
		String resultado;
		if(imc < 18.5) {
			resultado = "abaixo do peso";
		}
		else if(imc >= 18.5 && imc < 25) {
			resultado = "em peso normal";
		}
		else if(imc >= 25 && imc < 30) {
			resultado = "sobrepeso";
		}
		else{
			resultado = " de obesidade";
		}
		String outrosDados = "Relatorio de  Evolucao Fisica : \n Aluno :" + aluno.getNome() + "\n Matricula : "+aluno.getDataMatricula() + " \nIMC : " + imc;
		
		return outrosDados+ "\n Grau " + resultado;
	}
}
