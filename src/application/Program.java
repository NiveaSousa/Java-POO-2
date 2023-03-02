package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Chamado;
import entities.Setor;

public class Program {

	public static void main(String[] args) {
		ArrayList<Setor> setores = new ArrayList<Setor>();
        Setor rh = new Setor("rh", new ArrayList<Chamado>());
        Setor Adm = new Setor("Adm", new ArrayList<Chamado>());
        Setor Atendimento = new Setor("Atendimento", new ArrayList<Chamado>());
        Setor Financeiro  = new Setor("Financeiro", new ArrayList<Chamado>());
        
        setores.add(rh);
        setores.add(Adm);
        setores.add(Financeiro);
        setores.add(Atendimento);
        
        int tipo;
        int numero;
        String conteudo;
       
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;
        String escolha;

        
        while(opcao !=5){
            System.out.println("Sistema de Ouvidoria"+"\nMenu do Sistema"+"\n Sobre qual setor deseja tratar? "+ setores);
            escolha = leitor.nextLine();
            for (Setor setor: setores){
                if(setor.getSetor().equals(escolha)){
                    System.out.println("O que deseja fazer? 1. Listar Chamados 2. Cadastrar Chamados 3. Pesquisar Chamado 4. Apagar Chamado.");
                    opcao = leitor.nextInt();
                    switch(opcao) {
                    case 1:
                        if(setor.getChamados_set().isEmpty()){
                            System.out.println("Ainda não há manifestações.");
                            
                        }else{      
                            setor.listarChamados();
                            System.out.println(setor);
                        }
                        leitor.nextLine();
                    break;
                    case 2:
                        
                        System.out.println("Qual tipo de chamado deseja abrir? \n1) Elogio \n2) Reclamação \n3) Dúvida");
                        tipo = leitor.nextInt();
                        leitor.nextLine();
                        System.out.println("Digite descrição aqui:");
                        conteudo = leitor.nextLine();
                        numero = setor.getChamados_set().size()+ 1;
                        
                        Chamado objetoChamado = new Chamado(numero, tipo, conteudo);
                        setor.adcChamados(objetoChamado);
                        
                        break;
                    case 3:
                        System.out.println("Pesquisar por chamado aberto, digite número do chamado");
                        numero = leitor.nextInt();
                        leitor.nextLine();
                        setor.buscarChamado(numero);
                    break;
                    case 4:
                        System.out.println("Esses são os chamados em aberrto: ");
                        setor.listarChamados();
                        System.out.println(setor);
                        System.out.println("Digite o Número do que quer remover: ");
                        numero = leitor.nextInt();
                        leitor.nextLine();
                        setor.remover(numero);
                    break;
                    default:
                        System.out.println("Escolha opção válida");
                    }
                }
            }
}
        System.out.println("Obrigado por utilizar o sistema!");
    leitor.close();


	}

}
