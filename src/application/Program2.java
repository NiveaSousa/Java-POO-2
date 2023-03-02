package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Admin;
import entities.Chamado;
import entities.Usuario;
import util.Sistema;

public class Program2 {

	public static void main(String[] args) {
		// listas
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Chamado> chamados = new ArrayList<Chamado>();
		ArrayList<Admin> admins = new ArrayList<Admin>();
		Sistema sis = new Sistema();

		// adicionando para teste
		Usuario pessoa1 = new Usuario("Joao", "123");
		Usuario pessoa2 = new Usuario("Nivea", "123");

		Chamado cham1 = new Chamado(pessoa1, 1, 1, "abc");

		usuarios.add(pessoa2);
		usuarios.add(pessoa1);
		chamados.add(cham1);

		// variaveis de uso continuo
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		String escolha;
		int tipo;
		int numero;
		String conteudo;

		while (opcao != 5) {
			System.out.println("Sistema de Ouvidoria" + "\nMenu do Sistema" + "\n Escolha seu perfl"
					+ "\n 1. Usuário  2. Administrador");
			escolha = leitor.nextLine();
			switch (escolha) {
			case "1":
				System.out.println("Digite seu nome:");
				String nome = leitor.nextLine();
				System.out.println("Digite sua senha:");
				String senha = leitor.nextLine();
				Usuario teste = new Usuario(nome, senha);

				if (usuarios.isEmpty()) {
					System.out.println("Não há usuários cadastrados.");
				} else if (usuarios.contains(teste)) {

					System.out.println("O que deseja fazer? 1. Listar seus Chamados 2. Cadastrar Chamados.");
					opcao = leitor.nextInt();
					switch (opcao) {
					case 1:
						if (chamados.isEmpty()) {
							System.out.println("Ainda não há manifestações.");

						} else {
							sis.listarChamadosU(chamados, teste);
						}
						leitor.nextLine();
						break;
					case 2:
						System.out
								.println("Qual tipo de chamado deseja abrir? \n1) Elogio \n2) Reclamação \n3) Dúvida");
						tipo = leitor.nextInt();
						leitor.nextLine();
						System.out.println("Digite descrição aqui:");
						conteudo = leitor.nextLine();
						numero = chamados.size() + 1;

						Chamado objetoChamado = new Chamado(teste, numero, tipo, conteudo);
						chamados.add(objetoChamado);

						break;
					default:
						System.out.println("Escolha opção válida");
					}
				}

				break;
			case "2":
				System.out.println("Digite seu nome:");
				String nomeAdmin = leitor.nextLine();
				System.out.println("Digite sua matricula:");
				String matricula = leitor.nextLine();
				System.out.println("Digite sua senha:");
				String senhaAdmin = leitor.nextLine();
				Admin adm = new Admin(nomeAdmin, senhaAdmin, matricula);

				if (admins.isEmpty()) {
					System.out.println("Não há administrador cadastrados.");
				} else if (admins.contains(adm)) {
					System.out.println("O que deseja fazer? 1. Listar Chamados abertos 2. Remover Chamados.");
					opcao = leitor.nextInt();
					switch (opcao) {
					case 1:
						adm.acessoTotal(chamados);
						break;
					 case 2: 
						 System.out.println("Esses são os chamados em aberto: ");
						 adm.acessoTotal(chamados);
						 System.out.println("Digite o Número do que quer remover: "); 
						 numero = leitor.nextInt(); leitor.nextLine(); chamados.remover(numero); 
						 break;
					 
					}
				}
				break;
			default:
				System.out.println("Escolha opção válida");
			}
		}
	}
}
