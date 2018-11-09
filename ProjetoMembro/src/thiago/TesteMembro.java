package thiago;
import java.util.Date;

import java.io.IOException;

public class TesteMembro {

	public static void main(String[] args) throws IOException {
        
		Date dt = new Date();
		
		// INSTANCIANDO MEMBROS E EQUIPE
		
		Equipe eqp = new Equipe("XTremeSenior", "Azul" ,"Desenvolvedor", 3);

		Aluno aluno = new Aluno("Thiago", 001, "99971-2295", 20172025, "Sistemas de Informação", eqp);

		Professor prof = new Professor("Leonardo", 002, "9981-5942", "Informatica", "Relatório", eqp);
        
		Funcionario_Adm fun = new Funcionario_Adm("Joao Paulo", 003, "9589-4563", "Coordenadoria", 65254, eqp, dt);
		
	    // NOVA COR
		eqp.setCor("Vermelha");
		
		// ADICIONANDO MEMBROS
		
		eqp.addMembro(aluno);
		
		eqp.addMembro(prof);
		
		eqp.addMembro(fun);

		
		// IMPRIMINDO
		System.out.println(eqp.toString());
		System.out.println(aluno.toString());
		System.out.println(prof.toString());
		System.out.println(fun.toString());

		
		// GERANDO O ARQUIVO DE DADOS DOS MEMBROS
		
		eqp.imprimirCadaMembro();
		
		prof.imprimirComprovanteInscricao();
		
		fun.imprimirComprovanteInscricao();

		aluno.imprimirComprovanteInscricao();
		

	}

}
