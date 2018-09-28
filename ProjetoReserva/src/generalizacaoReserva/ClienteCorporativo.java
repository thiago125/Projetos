package generalizacaoReserva;

public class ClienteCorporativo extends Cliente {
	String clienteCNPJ;
	int numeroConta;
	int pontosAcumulados;

	public ClienteCorporativo(int clienteID, String clienteNome, String clienteTelefone, String clienteEmail,
			String clienteCNPJ, int numeroConta, int pontosAcumulados) {
		super(clienteID, clienteNome, clienteTelefone, clienteEmail);
		this.clienteCNPJ = clienteCNPJ;
		this.numeroConta = numeroConta;
		this.pontosAcumulados = pontosAcumulados;

	}

	public String getClienteCNPJ() {
		return clienteCNPJ;

	}
	public void setClienteCNPJ(String clienteCNPJ) {
		this.clienteCNPJ = clienteCNPJ;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getPontosAcumulados() {
		return pontosAcumulados;
	}

	public void setPontosAcumulados(int pontosAcumulados) {
		this.pontosAcumulados = pontosAcumulados;
	}
	
 @Override
 public String toString() {
	 return "ID DO CLIENTE - "+ getClienteID() + "\n" +
	        "NOME DO CLIENTE - "+ getClienteNome() + "\n" +
			"TELEFONE DO CLIENTE -" + getClienteTelefone() + "\n" +
			"EMAIL DO CLIENTE -"+ getClienteEmail() + "\n" + 
			"CNPJ CLIENTE - "+ getClienteCNPJ() + "\n" +
            "NUMERO DA CONTA - "+ getNumeroConta() + "\n" +
			"PONTOS ACUMULADOS -" + getPontosAcumulados() ;
 }
}
