package Associacao2;

public class Produto {
	private String nome;
	private int qtd;

	public Produto(String nome, int qtd) {
		this.nome = nome;
		this.qtd = qtd;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {

		return nome;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getQtd() {
		return qtd;
	}
	
	

}
