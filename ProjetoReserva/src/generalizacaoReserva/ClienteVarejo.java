package generalizacaoReserva;

public class ClienteVarejo extends Cliente {
	String bandeiraCartao;
	int numeroCartao;
	String clienteCpf;

	public ClienteVarejo(int clienteID, String clienteNome, String clienteTelefone, String clienteEmail,
			String bandeiraCartao, int numeroCartao, String clienteCpf) {
		super(clienteID, clienteNome, clienteTelefone, clienteEmail);
		this.bandeiraCartao = bandeiraCartao;
		this.numeroCartao = numeroCartao;
		this.clienteCpf = clienteCpf;

	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getClienteCpf() {
		return clienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		this.clienteCpf = clienteCpf;
	}
	
	
	@Override
	   public String toString() {
		 return "ID DO CLIENTE - "+ getClienteID() + "\n" +
		        "NOME DO CLIENTE - "+ getClienteNome() + "\n" +
				"TELEFONE DO CLIENTE -" + getClienteTelefone() + "\n" +
				"EMAIL DO CLIENTE -"+ getClienteEmail() + "\n" + 
			    "BANDEIRA DO CARTÃO - "+ getBandeiraCartao() + "\n" +
		        "NUMERO DO CARTÃO - "+ getNumeroCartao() + "\n" +
	      		"CPF DO CLIENTE -" + getClienteCpf() ;
		 
		

	}
	
}
