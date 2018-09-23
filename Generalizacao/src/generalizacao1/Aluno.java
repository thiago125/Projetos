package generalizacao1;

public class Aluno extends Pessoa {
	private String curso;
	private int matricula;

	public Aluno(String nome, String endereco, String telefone, String cpf,
			String curso, int matricula) {
		super(nome, endereco, telefone, cpf);
		this.curso = curso;
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	
	@Override
	public String toString(){
		return "DADOS DO ALUNO:" + "\n" + 
			       "-> NOME:" + getNome() + "\n" +  
			       "-> MATRICULA:" + getMatricula() + "\n" + 
			       "-> CURSO:" + getCurso() + "\n" + 
			       "-> ENDEREÇO:" + getEndereco() + "\n" +
			       "-> TELEFONE:" + getTelefone() + "\n" + 
			       "-> CPF:" + getCpf();
	}
}
