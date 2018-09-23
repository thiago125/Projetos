package AgregacaoI;

public class Pasta {
	private String nome, descricao;
	private int anoDeCriacao;
	Arquivos nomeArquivo, descricaoArquivo, extensao;

	public Pasta(String nome, String descricao, int anoDeCriacao, Arquivos nomeArquivo, Arquivos descricaoArquivo, Arquivos extensao) {
		this.nome = nome;
		this.descricao = descricao;
		this.anoDeCriacao = anoDeCriacao;
		this.nomeArquivo = nomeArquivo;
		this.descricaoArquivo = descricaoArquivo;
		this.extensao = extensao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeCriacao(int anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}
	
	public Arquivos getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(Arquivos nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public Arquivos getDescricaoArquivo() {
		return descricaoArquivo;
	}

	public void setDescricaoArquivo(Arquivos descricaoArquivo) {
		this.descricaoArquivo = descricaoArquivo;
	}

	public Arquivos getExtensao() {
		return extensao;
	}

	public void setExtensao(Arquivos extensao) {
		this.extensao = extensao;
	}

	@Override
	public String toString() {
		return "PASTAS E ARQUIVOS " + "\n"
			+   "NOME = " + nome.toString() + "\n" + 
				"DESCRIÇÃO = " + descricao.toString() + "\n" + 
				"ANO DE CRIAÇÃO = " + anoDeCriacao + "\n" +
				"NOME DO ARQUIVO = " + nomeArquivo + "\n" + 
				"DESCRIÇÃO DO ARQUIVO = " + descricaoArquivo + "\n" + 
				"EXTENSÃO = " + extensao;
	}



	
	
	
	
}
