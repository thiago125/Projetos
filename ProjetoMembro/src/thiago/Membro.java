package thiago;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Membro {
	String nome, telefone;
	int numInscricao;
	Equipe equipe;

	public Membro(String nome, int numInscricao, String telefone, Equipe equipe) {
		this.nome = nome;
		this.numInscricao = numInscricao;
		this.telefone = telefone;
		this.equipe = equipe;
		
	}
	
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe (Equipe equipe) {
		this.equipe = equipe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getNumInscricao() {
		return numInscricao;
	}

	public void setNumInscricao(int numInscricao) {
		this.numInscricao = numInscricao; 
	}



	public void imprimirComprovanteInscricao() throws IOException {
		FileWriter arq = new FileWriter("C:\\Users\\20172in025\\Documents\\DadosMembro.doc", true);
		PrintWriter impressaoArq = new PrintWriter(arq);

		impressaoArq.printf(toString());
		arq.close();
	}

}
