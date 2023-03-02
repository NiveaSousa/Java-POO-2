package entities;

public class Chamado {
	private Usuario criador;
    private int codigo;
    private int tipo;
    private String conteudo;
    
    public Chamado(){
        
    }
    
    public Chamado(Usuario criador, int codigo, int tipo, String conteudo){
    	this.criador = criador;
        this.conteudo = conteudo;
        this.tipo = tipo;
        this.codigo= codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public Usuario getCriador() {
		return criador;
	}

	public void setCriador(Usuario criador) {
		this.criador = criador;
	}

	public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    @Override // Anotation para sobrescrita
    public String toString() {
        String retorno = "Tipo: " + this.tipo+ " | Conteúdo: " + this.conteudo + "| Número : " + this.codigo;
        return retorno;
    }
}
