package br.com.malanczen.visao;

import java.util.Scanner;

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

			
			switch(opcao) {
			case 1:
				System.out.println("Cadastrando aluno");
				
			break;
			case 8:
				System.out.println("Encerrando programa");
			}
		
		}while(opcao != 8);
	}
}
