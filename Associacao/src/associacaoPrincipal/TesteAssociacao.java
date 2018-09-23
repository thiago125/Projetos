package associacaoPrincipal;

import associacaoI.*;

public class TesteAssociacao {
	public static void main(String[] args) {

		System.out.println("PROGRAMA PRINCIPAL ASSOCIAÇÃO");
		Departamento depto1 = new Departamento("DEPARTAMENTO TI");
		System.out.println(depto1.toString());

		Funcionario func1 = new Funcionario("JOÂO SOUZA", 22, depto1);
		Funcionario func2 = new Funcionario("MARIA LIMA", 19, depto1);
		Funcionario func3 = new Funcionario("HUGO OLIVEIRA", 23, depto1);

		System.out.println(func1.toString());
		System.out.println(func2.toString());
		System.out.println(func3.toString());

		depto1.addFuncionarios(func1);
		depto1.addFuncionarios(func2);
		depto1.addFuncionarios(func3);

		System.out.println("FUNCIONÁRIOS DEPARTAMENTO");
		System.out.println(depto1.getFuncionario());

	}

}
