package arquivo;
import java.io.IOException;

public class ProjetoTeste {

	public static void main(String[] args) throws IOException {
        
		// INSTACIANDO AS PESSOAS 
		Funcionario fun = new Funcionario("Thiago", "Santos", 20, (float) 1300.00, 43569, "SI");
		Estagiario est = new Estagiario("Lucas", "romulo", 26, (float) 2200.00, 201287, "DIREITO");
	
		System.out.println("IMPRIMINDO FICHA CADASTRAL DE FUNCION�RIO");
		System.out.println(fun.toString());
		System.out.println("IMPRIMINDO FICHA CADASTRAL DE ESTAGI�RIO");
		System.out.println(est.toString());

		
		
		//INSTANCIANDO TURMA
		Turma t1 = new Turma("T�CNICO DE INFORM�TICA", 60, "PROGRAMA��O");
		System.out.println("IMPRIMINDO DADOS DE TURMA");
		System.out.println(t1.toString());
        
		// INSTANCIANDO PROFESSOR
		Professor prof = new Professor(fun.getNome(), fun.getSobrenome(), fun.getIdade(), fun.getSalario(), 
				fun.getSiap(), fun.getCoordenadoria(), "RELAT�RIO", t1 );
		
		System.out.println("GERANDO ARQUIVO DE FUNCION�RIO");
		fun.imprimirArquivoFuncionario();
		System.out.println("GERANDO ARQUIVO DE ESTAGI�RIO");
		est.imprimirArquivoEstagiario();
		System.out.println("GERANDO ARQUIVO DE PROFESSOR");
		prof.imprimirArquivoProfessor();
		
		
		//est.setCurso("Engenharia de Minas");
		
	}

}


