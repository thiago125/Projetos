package generalizacao1;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCurso;
	private Double salario;

	public Professor(String nome, String endereco, String telefone, String cpf,
			String departamento, String nomeCurso, Double salario) {
		super(nome, endereco, telefone, cpf);
		this.departamento = departamento;
		this.nomeCurso = nomeCurso;
		this.salario = salario;

	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
	return "DADOS PROFESSOR:" + "\n" + 
	       "-> NOME:" + getNome() + "\n" +  
	       "-> CURSO:" + getNomeCurso() + "\n" + 
	       "-> DEPARTAMENTO:" + getDepartamento() + "\n" + 
	       "-> SALÁRIO:" + getSalario() + "\n" + 
	       "-> ENDEREÇO:" + getEndereco() + "\n" +
	       "-> TELEFONE:" + getTelefone() + "\n" + 
	       "-> CPF:" + getCpf();
	} 

}
