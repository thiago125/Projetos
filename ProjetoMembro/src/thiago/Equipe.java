package thiago;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Equipe {
	String nome, setor;
	int quantElementos;
	String cor;
	private ArrayList<Membro> membros;

	public Equipe(String nome, String cor ,String setor, int quantElementos) {
		this.nome = nome;
		this.cor = cor;
		this.setor = setor;
		this.quantElementos = quantElementos;
		this.membros = new ArrayList<Membro>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getQuantElementos() {
		return quantElementos;
	}

	public void setQuantElementos(int quantElementos) {
		this.quantElementos = quantElementos;
	}

	public String getMembro() {
		String pRetorno = "";
		for (int i = 0; i < this.membros.size(); i++) {
			pRetorno = pRetorno + this.membros.get(i) + "\n";
		}
		return pRetorno;
	}

	public void addMembro(Membro membros) {
		this.membros.add(membros);
	}
	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "----------------------EQUIPE---------------------------------" + 
	           "\n" + 
			   "\n NOME: " + getNome() + 
			   "\n COR DA EQUIPE: " + getCor() + 
	           "\n SETOR: " + getSetor() + 
			   "\n QUANTIDADE DE ELEMENTOS: " + getQuantElementos() +  
	           "\n MEMBROS: " + getMembro() + 
	           "\n" + 
	           "--------------------------------------------------------------";
	}

	public void imprimirCadaMembro() throws IOException {
		FileWriter arq = new FileWriter("C:\\Users\\20172in025\\Documents\\DadosEquipe.doc", true);
		PrintWriter impressaoArq = new PrintWriter(arq);

		impressaoArq.printf(toString());

		arq.close();

	}
}
