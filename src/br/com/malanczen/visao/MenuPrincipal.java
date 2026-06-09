package br.com.malanczen.visao;

import java.util.Scanner;

import br.com.malanczen.enums.Especialidades;
import br.com.malanczen.enums.GrupoMuscular;
import br.com.malanczen.servico.GerenciadorAcademia;


public class MenuPrincipal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		GerenciadorAcademia gerenciador = new GerenciadorAcademia();
		
		int opcao = -1;
		//===========Tabela Principal===========
		
		do {
		System.out.println("Digite a opcao desejada");
		System.out.println("========== GYMPROGRESS - MENU ==========\r\n"
				+ "1. Cadastrar Novo Aluno\r\n"
				+ "2. Cadastrar Novo Instrutor\r\n"
				+ "3. Cadastrar Exercício Base\r\n"
				+ "4. Montar/Vincular Ficha de Treino para Aluno\r\n"
				+ "5. Adicionar Exercício a uma Ficha Existente\r\n"
				+ "6. Exibir Ficha de Treino Completa do Aluno\r\n"
				+ "7. Consultar IMC e Relatório Físico do Aluno\r\n"
				+ "8. Sair do Sistema\r\n"
				+ "========================================\r\n"
				+ "Opção desejada: ");
		 opcao = scanner.nextInt();
		 scanner.nextLine();
			
			switch(opcao) {
			//Opcao para cadastrar alunos
			case 1:
				System.out.println("Opcao de cadastrar aluno acessada \n");
				System.out.println("Digite os dados solicitados: \n");
				
				System.out.println("Nome \n");
				String nomeAluno = scanner.nextLine();
				
				System.out.print("Data de Matrícula: \n");
				String data = scanner.nextLine();
				
				System.out.print("Peso (kg): \n");
				double peso = scanner.nextDouble();
				
				System.out.print("Altura (m use ,): \n");
				double altura = scanner.nextDouble();
				scanner.nextLine();
				
				gerenciador.cadastrarAluno(nomeAluno, data, peso, altura);
				System.out.println("Cadastro do aluno " + nomeAluno +" realizado com sucesso");
				System.out.println("-------------");
				
				
			break;
			
			//Opcao para cadastrar instrutores
			case 2:
			System.out.println("Opcao de cadastrar instrutores acessada \n");
			System.out.println("Digite os dados solicitados: \n");
			
			System.out.println("Nome \n");
			String nomeInstrutor = scanner.nextLine();
			
			System.out.print("Data de Matrícula: \n");
			String dataInst = scanner.nextLine();
			
			System.out.print("Cref: \n");
			String cref = scanner.nextLine();
			
			System.out.println("Especialidade permitidas :");
			System.out.println("Musculacao");
			System.out.println("Crossfit");
			System.out.println("Cardio \n");
			
			String especialidade = scanner.nextLine().toUpperCase().trim();
			Especialidades esp = Especialidades.valueOf(especialidade);
			
			gerenciador.cadastrarInstrutor(nomeInstrutor, dataInst, cref, esp);
			System.out.println("Cadastro do instrutor " + nomeInstrutor +" realizado com sucesso");
			System.out.println("-------------");
			break;		
			
			//Opcao para cadastrar exercicios base
			case 3:
			System.out.println("Opcao de cadastrar execicios acessada \n");
			System.out.println("Digite os dados solicitados: \n");
			
			System.out.println("Nome do exercicio \n");
			String nomeExercicio = scanner.nextLine();
			
			System.out.print("Grupo Muscular: \n");
			System.out.println("Opcoes Permitidas:");
			System.out.println("Peito");
			System.out.println("Costas");
			System.out.println("Ombro");
			System.out.println("Pernas");
			System.out.println("Braco");
			String grupoMuscular = scanner.nextLine().toUpperCase().trim();
			GrupoMuscular gM = GrupoMuscular.valueOf(grupoMuscular);
			
			System.out.println("Cadastro do exercicio " + nomeExercicio +" realizado com sucesso");
			System.out.println("-------------");
			gerenciador.cadastrarExercicio(nomeExercicio, gM);
			break;
			
			//Opcao para vincular/montar fica de treino para aluno
			case 4:
				
			break;
			//Opcao para adicionar treino a ficha ja existente
			case 5:
				
			break;
			//Opcao para exibir ficha de treino do aluno
			case 6:
				
			break;
			//Opcao para calcular IMC e dados do aluno
			case 7:
				
			break;
			//Opcao para encerrar o programa
			case 8:
				System.out.println("Encerrando programa");
			}
		
		}while(opcao != 8);
		
	}
}
