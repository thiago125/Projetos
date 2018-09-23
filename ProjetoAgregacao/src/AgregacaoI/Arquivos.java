package AgregacaoI;

public class Arquivos {
	String nomeArquivo, descricaoArquivo, extensao;

	public Arquivos(String nomeArquivo, String descricaoArquivo, String extensao) {
		this.nomeArquivo = nomeArquivo;
		this.descricaoArquivo = descricaoArquivo;
		this.extensao = extensao;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getDescricaoArquivo() {
		return descricaoArquivo;
	}

	public void setDescricaoArquivo(String descricaoArquivo) {
		this.descricaoArquivo = descricaoArquivo;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	@Override
	public String toString() {
		return "ARQUIVO  - " + "\n" 
				+ "NOME DO ARQUIVO = " + nomeArquivo + "\n" + 
				"DESCRIÇÃO DO ARQUIVO = " + descricaoArquivo + "\n" +
				"EXTENSÃO = "+ extensao ;
	}




}
