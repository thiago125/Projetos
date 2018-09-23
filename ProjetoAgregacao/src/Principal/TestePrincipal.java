package Principal;


import AgregacaoI.*;


public class TestePrincipal {

	public static void main(String[] args) {


		// INSTANCIANDO OS ARQUIVOS
		Arquivos a1 = new Arquivos ("FOTOS DE THIAGO", "FOTOS DO 1º ANO DE FACULDADE ","JPG");
		System.out.println(a1.toString());
		System.out.println("-----------------------------------------------------------------------");
		
		Arquivos a2 = new Arquivos ("MÚSICAS DE THIAGO", "MÚSICAS VARIADAS","MP3");
		System.out.println(a2.toString());
		System.out.println("-----------------------------------------------------------------------");
		
		Arquivos a3 = new Arquivos ("CÓDIGOS", "CÓDIGOS EM JAVA ","JAVA");
		System.out.println(a3.toString());
		System.out.println("-----------------------------------------------------------------------");
		
		// IMPRIMINDO OS ARQUIVOS INSTANCIADOS
		System.out.println(a1.toString());
		System.out.println("-----------------------------------------------------------------------");
	
		// INSTANCIANDO AS PASTAS COMPOSTAS COM OS ARQUIVOS*/
		Pasta p1 = new Pasta("FOTOS", "MINHAS FOTOS", 2016, a1, a2, a3);
		Pasta p2 = new Pasta("MÚSICAS", "MINHAS MÚSICAS", 2017, a1, a2, a3);
		Pasta p3 = new Pasta("MATERIAIS", "MEUS MATERIAIS", 2018, a1, a2, a3);
		
 	    // IMPRIMINDO AS PASTAS INSTANCIADAS
	    
		System.out.println(p1.toString());
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(p2.toString());
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(p3.toString());
		
		
		
		
		
	}

}
