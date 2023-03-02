package util;

import java.util.ArrayList;

import entities.Admin;
import entities.Chamado;
import entities.Pessoa;
import entities.Usuario;

public class Sistema {
	
	public void listarChamadosU(ArrayList<Chamado> chamados, Usuario usuario){
		for (Chamado chamado : chamados) {
			if (chamado.getCriador().equals(usuario)) {
				System.out.println(chamado.toString());
			}
		}
	}
	
	
	public void cadastroAdm(Pessoa admin) {
		Admin adm = new Admin();
	}
	
	public void cadastroUser(Pessoa usuario) {
		Usuario user = new Usuario();
	}

	
		            

}
