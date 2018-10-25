package arquivo;
import java.io.IOException;

public class ProjetoTeste {

	public static void main(String[] args) throws IOException {
        
		// INSTACIANDO AS PESSOAS 
		Funcionario fun = new Funcionario("Thiago", "Santos", 20, (float) 1300.00, 43569, "SI");
		Estagiario est = new Estagiario("Lucas", "romulo", 26, (float) 2200.00, 201287, "DIREITO");
	
		System.out.println("IMPRIMINDO FICHA CADASTRAL DE FUNCIONÁRIO");
		System.out.println(fun.toString());
		System.out.println("IMPRIMINDO FICHA CADASTRAL DE ESTAGIÁRIO");
		System.out.println(est.toString());

		
		
		//INSTANCIANDO TURMA
		Turma t1 = new Turma("TÉCNICO DE INFORMÁTICA", 60, "PROGRAMAÇÃO");
		System.out.println("IMPRIMINDO DADOS DE TURMA");
		System.out.println(t1.toString());
        
		// INSTANCIANDO PROFESSOR
		Professor prof = new Professor(fun.getNome(), fun.getSobrenome(), fun.getIdade(), fun.getSalario(), 
				fun.getSiap(), fun.getCoordenadoria(), "RELATÓRIO", t1 );
		
		System.out.println("GERANDO ARQUIVO DE FUNCIONÁRIO");
		fun.imprimirArquivoFuncionario();
		System.out.println("GERANDO ARQUIVO DE ESTAGIÁRIO");
		est.imprimirArquivoEstagiario();
		System.out.println("GERANDO ARQUIVO DE PROFESSOR");
		prof.imprimirArquivoProfessor();
		
		
		//est.setCurso("Engenharia de Minas");
		
	}

}


