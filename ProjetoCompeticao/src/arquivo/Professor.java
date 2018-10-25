package arquivo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Professor extends Funcionario {
	private String pit;
	private Turma turma;	
	
	public Professor(String nome, String sobrenome, int idade, float salario, int siap, String coordenadoria, String pit, Turma turma ) {
		super(nome, sobrenome, idade, salario, siap, coordenadoria);
		this.pit = pit;
		this.turma = turma;
		
		}


	public String getPit() {
		return pit;
	}


	public void setPit(String pit) {
		this.pit = pit;
	}
	
	public Turma getTurma() {
		return turma;
	}

	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	@Override
     public String toString() {
		return"\n---------------PROFESSOR--------------------------" + 
               "\n NOME: " + getNome() + 
			   "\n SOBRENOME: " + getSobrenome() + 
               "\n IDADE: " + getIdade() + 
			   "\n SALARIO: " + getSalario() +
               "\n SIAP: "+ getSiap() + 
			   "\n COORDENADORIA: " + getCoordenadoria() + 
			   "\n PIT: " + getPit() + 
               "\n TURMA: " + getTurma() + 
               "\n" + 
               "----------------------------------------------------";
               
	}	
	public void imprimirArquivoProfessor() throws IOException{
	 FileWriter arq = new FileWriter("C:\\Users\\20172in025\\Documents\\DadosProfessor.doc",true);
	 PrintWriter impressaoArq = new PrintWriter(arq);
	 
	 impressaoArq.printf(toString());
	 arq.close();
  }
               
	}	
	
	
	


