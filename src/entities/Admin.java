package entities;

import java.util.ArrayList;

public class Admin extends Pessoa{	
	String matricula;


	public Admin(String nome, String senha, String matricula) {
		super(nome, senha);
		this.matricula = matricula;
	}
	
	public Admin() {
		
	}

	public void acessoTotal(ArrayList<Chamado> chamados) {
		for(Chamado chamado : chamados) {
			System.out.println(chamado.toString());
		}
	}
	
	public void remover(ArrayList<Chamado> chamados, int numero){
        for (Chamado chamado : chamados) {
            if (chamado.getCodigo()== numero){
                chamados.remove(chamado);
                System.out.println("Removido");
            }
        }
    }
}
