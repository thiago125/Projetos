package generalizacaoPrincipal;

import generalizacao1.*;

public class TestePessoa {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("THIAGO SANTOS",
				"RUA MARCOLINO LINO DE NOVAES , N� 171 ", "28 99971-2295",
				"148.783.317-20", "SISTEMAS DE INFORMA��O", 20172025);

		System.out.println(aluno1.toString());

		System.out.println("---------------------------------------------------------------");

		Professor professor1 = new Professor("FRANCISCO CABRAL",
				"RUA PARAISO, N� 17", "28 99956-4599", "178.658.285-00",
				"COORDENADORIA DE SISTEMAS DE INFORMA��O", "SISTEMAS DE INFORMA��O", 8952.20);
		
		System.out.println(professor1.toString());
		System.out.println("----------------------------------------------------------------");
		
		aluno1.setCurso("CIENCIA DA COMPUTA��O");
	    System.out.println(aluno1.getCurso());
	    
	    System.out.println("-----------------------------------------------------------------");
	    
	    professor1.setSalario(11000.00);
	    System.out.println(professor1.getSalario());
	    
	    System.out.println("------------------------------------------------------------------");
	    System.out.println(professor1.toString());
	}
}
