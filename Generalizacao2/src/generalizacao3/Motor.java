package generalizacao3;

public class Motor extends Equipamento {
	private String velocidade;
	private String potencia;

	public Motor(String marca, String modelo, int anoFabricacao, double valor,
			String velocidade, String potencia) {
		super(marca, modelo, anoFabricacao, valor);
		this.velocidade = velocidade;
		this.potencia = potencia;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "MOTOR - " + 
	           "-> MARCA: " + getMarca() + "\n" + 
			   "-> MODELO: " + getModelo() + "\n" + 
	           "-> ANO DE FABRICAÇÃO: " + getAnoFabricacao() + "\n" + 
			   "-> VALOR: " + getValor() + "\n" + 
	           "-> VELOCIDADE: " + getVelocidade() + "\n" + 
			   "-> POTÊNCIA: " + getPotencia();
	}
	
	

}
