package thiago;
import java.util.Date;

public class Funcionario_Adm extends Membro {
	String setor;
	int siap;
    Date dataAtual;
    
	public Funcionario_Adm(String nome, int numInscricao, String telefone, String setor, int siap, Equipe equipe, Date dataAtual) {

		super(nome, numInscricao, telefone, equipe);
		this.setor = setor;
		this.siap = siap;
		this.equipe = equipe;
		this.dataAtual = dataAtual;
	    }

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getSiap() {
		return siap;
	}

	public void setSiap(int siap) {
		this.siap = siap;
	}

	
	 public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}

	@Override
     public String toString() {
    	 return "\n--------------DADOS FUNCIONARIO ADM-------------" +
    			"\n" + 
    	 		"\n NOME: "+ getNome() +
    	        "\n NUMERO DE INSCRIÇÃO: "+ getNumInscricao() +
    	        "\n TELEFONE: "+ getTelefone() +  
    	        "\n SETOR: "+ getSetor() + 
    	        "\n SIAP: "+ getSiap() +
    	        "\n EQUIPE: "+ equipe.getNome() + 
    	        "\n DATA DA INSCRIÇÃO: "+ getDataAtual() + 
    	        "\n" + 
    	        "-------------------------------------------------" ;
     }
	
	
	
	
}
