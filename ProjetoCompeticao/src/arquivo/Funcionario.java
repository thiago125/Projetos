package arquivo;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Funcionario extends Pessoa {
	int siap;
	String coordenadoria;

	public Funcionario(String nome, String sobrenome, int idade, float salario,
			int siap, String coordenadoria) {
		super(nome, sobrenome, idade, salario);
		this.siap = siap;
		this.coordenadoria = coordenadoria;
		
	}

	public int getSiap() {
		return siap;
	}

	public void setSiap(int siap) {
		this.siap = siap;
	}

	public String getCoordenadoria() {
		return coordenadoria;
	}

	public void setCoordenadoria(String coordenadoria) {
		this.coordenadoria = coordenadoria;
	}


    @Override
    public String toString(){
    	return  "\n------------DADOS FUNCIONARIO--------------" +
    			"\n" + 
    			"\n NOME: "+ getNome() +
    	        "\n SOBRENOME: "+ getSobrenome() +
    	        "\n IDADE: "+ getIdade() +  
    	        "\n SALARIO: "+ getSalario() + 
    	        "\n SIAP DO FUNCIONÁRIO: "+ getSiap() + 
    	        "\n COORDENADORIA: "+ getCoordenadoria() +
    	        "\n" + 
    	        "--------------------------------------------";
    }
    
    public void imprimirArquivoFuncionario() throws IOException{
    	FileWriter arq = new FileWriter("C:\\Users\\20172in025\\Documents\\DadosFuncionario.doc", true);
    	PrintWriter impressaoArq = new PrintWriter(arq);
    	
    	impressaoArq.printf(toString());
    	arq.close();
    }


}
