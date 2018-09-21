package Associacao2;

import java.util.ArrayList;

public class Estoque {
	private String localizacao;
	private ArrayList<Produto> produtos;

	public Estoque(String localizacao) {
		this.localizacao = localizacao;
		this.produtos = new ArrayList<Produto>();
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;

	}

	public String getLocalizacao() {
		return localizacao;
	}

}
