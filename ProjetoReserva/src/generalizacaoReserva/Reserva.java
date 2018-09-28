package generalizacaoReserva;

import java.util.Date;

public class Reserva {
	 int reservaNumero;
	 Date reservaData;
	 Assento assento1, assento2;
	 Cliente cliente;
	
    
	public Reserva(int reservaNumero, Date reservaData, Assento assento1, Assento assento2, Cliente cliente) {
		this.reservaNumero = reservaNumero;
		this.reservaData = reservaData;
		this.assento1 = assento1;
		this.assento2 = assento2;
		this.cliente = cliente;
	}
	
	public int getReservaNumero() {
		return reservaNumero;
	}
	
	public void setReservaNumero(int reservaNumero) {
		this.reservaNumero = reservaNumero;
	}
	
	public Date getReservaData() {
		return reservaData;
	}
	public void setReservaData(Date reservaData) {
		this.reservaData = reservaData;
	}
	
	public Assento getAssento1() {
		return assento1;
	}
	public void setAssento1(Assento assento1) {
		this.assento1 = assento1;
	}
	
	
	public Assento getAssento2() {
		return assento2;
	}

	public void setAssento2(Assento assento2) {
		this.assento2 = assento2;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "NUMERO DA RESERVA - " +getReservaNumero() + "\n" +
			   "DATA DA RESERVA - " + getReservaData() + "\n" +
			   "ASSENTO 1 -"+ assento1.toString()  + "\n" +
			   "ASSENTO 2 -"+ assento2.toString()  + "\n" +
			   "CLIENTE - " + getCliente()  ;
	}
}
