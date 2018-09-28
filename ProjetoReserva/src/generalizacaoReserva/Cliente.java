package generalizacaoReserva;

import java.util.ArrayList;

public class Cliente {
	private int clienteID;
	private String clienteNome, clienteTelefone, clienteEmail;
	private ArrayList<Reserva> reservas;

	public Cliente(int clienteID, String clienteNome, String clienteTelefone, String clienteEmail) {
		this.clienteID = clienteID;
		this.clienteNome = clienteNome;
		this.clienteTelefone = clienteTelefone;
		this.clienteEmail = clienteEmail;
		this.reservas = new ArrayList<Reserva>();
	}

	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public String getClienteTelefone() {
		return clienteTelefone;
	}

	public void setClienteTelefone(String clienteTelefone) {
		this.clienteTelefone = clienteTelefone;
	}

	public String getClienteEmail() {
		return clienteEmail;
	}

	public void setClienteEmail(String clienteEmail) {
		this.clienteEmail = clienteEmail;
	}

	public String getReservas() {
		String pRetorno = "";
		for (int i = 0; i < this.reservas.size(); i++) {
			pRetorno = pRetorno + this.reservas.get(i) + "\n";

		}
		return pRetorno;
	}

	public void addReserva(Reserva reservas) {
		this.reservas.add(reservas);

	}

}
