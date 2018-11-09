package thiago;

public class Professor extends Membro {
	String coordenadoria, pit;

	public Professor(String nome, int numInscricao, String telefone, String coordenadoria, String pit, Equipe equipe) {

		super(nome, numInscricao, telefone, equipe);
		this.coordenadoria = coordenadoria;
		this.pit = pit;
		this.equipe = equipe;

	}

	public String getCoordenadoria() {
		return coordenadoria;
	}

	public void setCoordenadoria(String coordenadoria) {
		this.coordenadoria = coordenadoria;
	}

	public String getPit() {
		return pit;
	}

	public void setPit(String pit) {
		this.pit = pit;
	}

	@Override
	public String toString() {
		return "----------------DADOS PROFESSOR---------------------" + 
			   "\n" + 
		       "\n NOME:" + getNome() + 
	           "\n NUMERO DE INSCRIÇÃO: " + getNumInscricao() + 
			   "\n TELEFONE: " + getTelefone() +
			   "\n COORDENADORIA: " + getCoordenadoria() + 
			   "\n PIT: " + getPit() +
			   "\n EQUIPE: "+ equipe.getNome() +  
			   "\n" + 
			   "----------------------------------------------------";
	}

}
