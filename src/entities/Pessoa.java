package entities;

public abstract class Pessoa {
	private String nome;
	private String senha;
	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha= senha;
	}
	
	

}
