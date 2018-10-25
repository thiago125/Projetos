package arquivo;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Estagiario extends Pessoa {
	int matricula;
	String curso;

	public Estagiario(String nome, String sobrenome, int idade, float salario, int matricula, String curso) {
		super(nome, sobrenome, idade, salario);
        this.matricula = matricula;
        this.curso = curso;
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
    	 return "\n-------DADOS ESTAGIARIO-----------" +
    			"\n" + 
    	 		"\n NOME: "+ getNome() +
    	        "\n SOBRENOME: "+ getSobrenome() +
    	        "\n IDADE: "+ getIdade() +  
    	        "\n SALARIO: "+ getSalario() + 
    	        "\n MATRICULA: "+ getMatricula() + 
    	        "\n CURSO: "+ getCurso() +
    	        "\n" + 
    	        "-----------------------------------" ;
     }
     

     public void imprimirArquivoEstagiario() throws IOException{
    	FileWriter arq = new FileWriter("C:\\Users\\20172in025\\Documents\\DadosEstagiario.doc", true); 
    	PrintWriter impressaoArq = new PrintWriter(arq);
    	
    	impressaoArq.printf(toString());
    	arq.close();
     }










}
