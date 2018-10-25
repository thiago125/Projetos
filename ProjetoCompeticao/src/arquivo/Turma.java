package arquivo;

public class Turma {

	String nome, disciplina;
	int numAlunos;
	
	public Turma(String nome, int numAlunos, String disciplina) {
		this.nome = nome;
		this.numAlunos = numAlunos;
		this.disciplina = disciplina;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getNumAlunos() {
		return numAlunos;
	}

	public void setNumAlunos(int numAlunos) {
		this.numAlunos = numAlunos;
	}
	
	
	
	@Override
    public String toString(){
    	return  "NOME: "+ getNome() +  "\n" +
    	        "NUMERO DE ALUNOS: "+ getNumAlunos() +  "\n" +
    	        "DISCIPLINA: "+ getDisciplina();
    	        
    	   

	
   }
}
