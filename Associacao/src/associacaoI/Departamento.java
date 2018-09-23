package associacaoI;

import java.util.ArrayList;

public class Departamento {

	private String descricao;
	private ArrayList<Funcionario> funcionarios;

	public Departamento(String descricao) {
		this.descricao = descricao;
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFuncionario() {
		String pRetorno = "";
		for (int i = 0; i < this.funcionarios.size(); i++) {
			pRetorno += this.funcionarios.get(i) + "\n";
		}
		return pRetorno;
	}

	public void addFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}

	@Override
	public String toString() {
		return descricao;
	}
}
