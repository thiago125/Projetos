package generalizacaoReserva;

public class Assento {
	String classeAssento;
	int numeroAssento;
	String filaAssento;

	public Assento(String classeAssento, int numeroAssento, String filaAssento) {
		this.classeAssento = classeAssento;
		this.numeroAssento = numeroAssento;
		this.filaAssento = filaAssento;
	}

	public String getClasseAssento() {
     return classeAssento;
	}
	
	public void setClasseAssento(String classeAssento) {
		this.classeAssento = classeAssento;
	}
	public int getNumeroAssento() {
		return numeroAssento;
	}
	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	public String getFilaAssento() {
		return filaAssento;
	}
	
	public void setFilaAssento(String filaAssento) {
		this.filaAssento = filaAssento;
	}
	
	@Override
	public String toString() {
		return "CLASSE DO ASSENTO - "+ getClasseAssento() + "\n" +
	           "NUMERO DO ASSENTO - "+ getNumeroAssento() + "\n" + 
			   "FILA DO ASSENTO - "+ getFilaAssento();
	}

}
