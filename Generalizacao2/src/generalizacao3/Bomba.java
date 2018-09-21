package generalizacao3;

public class Bomba extends Equipamento {

	private String pressaoSuccao;
	private String pressaoDescarga;
	private String taxaDeFluxo;

	public Bomba(String marca, String modelo, int anoFabricacao, double valor,
			String pressaoSuccao, String pressaoDescarga, String taxaDeFluxo) {
		super(marca, modelo, anoFabricacao, valor);
		this.pressaoSuccao = pressaoSuccao;
		this.pressaoDescarga = pressaoDescarga;
		this.taxaDeFluxo = taxaDeFluxo;

	}

	public String getPressaoSuccao() {
		return pressaoSuccao;
	}

	public void setPressaoSuccao(String pressaoSuccao) {
		this.pressaoSuccao = pressaoSuccao;
	}

	public String getPressaoDescarga() {
		return pressaoDescarga;
	}

	public void setPressaoDescarga(String pressaoDescarga) {
		this.pressaoDescarga = pressaoDescarga;
	}

	public String getTaxaDeFluxo() {
		return taxaDeFluxo;
	}

	public void setTaxaDeFluxo(String taxaDeFluxo) {
		this.taxaDeFluxo = taxaDeFluxo;
	}
	
	@Override
	public String toString(){
		return "BOMBA - " +
	           "-> MARCA: " + getMarca() + "\n" + 
			   "-> MODELO: " + getModelo() + "\n" + 
	           "-> ANO DE FABRICA��O: " + getAnoFabricacao() + "\n" + 
			   "-> VALOR: " + getValor() + "\n" + 
	           "-> PRESS�O DE SUC��O: " + getPressaoSuccao() + "\n" + 
			   "-> PRESS�O DE DESCARGA: " + getPressaoDescarga() + "\n" +
	           "-> TAXA DE FLUXO: " + getTaxaDeFluxo();
	}
	
	
	
}
