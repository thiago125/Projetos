package thiago;

public class Aluno extends Membro {
	int matricula;
	String curso;
	
	public Aluno(String nome, int numInscricao, String telefone, int matricula, String curso, Equipe equipe) {
		super(nome, numInscricao, telefone, equipe);
		this.matricula =  matricula;
		this.curso = curso;
		this.equipe = equipe;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	 @Override
     public String toString() {
    	 return "\n-------DADOS ALUNO-----------" +
    			"\n" + 
    	 		"\n NOME: "+ getNome() +
    	        "\n NUMERO DE INSCRIÇÃO: "+ getNumInscricao() +
    	        "\n TELEFONE: "+ getTelefone() +  
    	        "\n MATRICULA: "+ getMatricula() + 
    	        "\n CURSO: "+ getCurso() +
    	        "\n EQUIPE: " + equipe.getNome() +  
    	        "\n" + 
    	        "-----------------------------------" ;
     }
	 
	 
}
