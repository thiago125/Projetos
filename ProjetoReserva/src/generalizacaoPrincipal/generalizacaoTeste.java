package generalizacaoPrincipal;

import java.util.Date;
import generalizacaoReserva.*;

public class generalizacaoTeste {

	public static void main(String[] args) {

		// INSTANCIANDO OS CLIENTES
		ClienteCorporativo cCorporativo = new ClienteCorporativo(12, "THIAGO", "(28) 99985-2295", "thiago@gmail.com",
				"152.564.215-9", 7515, 15);
		ClienteVarejo cVarejo = new ClienteVarejo(13, "ROMULO", "(28) 99981-3395", "romulo@gmail.com", "VISA", 00652,
				"149.569.221-20");

		// IMPRIMINDO OS CLIENTES INSTANCIADOS
		System.out.println(cCorporativo.toString());
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(cVarejo.toString());
		System.out.println("-----------------------------------------------------------------------------------");

		// INSTANCIANDO OS ASSENTOS
		Assento assento1 = new Assento("1ª CLASSE", 20, "FILA A");
		Assento assento2 = new Assento("CLASSE ECONÔMICA", 15, "FILA C");

		// IMPRIMINDO OS ASSENTOS INSTANCIADOS
		System.out.println(assento1.toString());
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(assento2.toString());
		System.out.println("-----------------------------------------------------------------------------------");

		// INSTANCIANDO A DATA PARA FAZER AS RESERVAS
		Date dt = new Date();

		// INSTANCIANDO AS RESERVAS
		Reserva reserva1 = new Reserva(1, dt, assento1, assento2, cVarejo);
		Reserva reserva2 = new Reserva(2, dt, assento1, assento2, cCorporativo);

		// IMPRIMINDO AS RESERVAS INSTANCIADOS
		System.out.println(reserva1.toString());
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println(reserva2.toString());
		System.out.println("-----------------------------------------------------------------------------------");

		// ADICIONANDOS AS RESERVAS A CADA CLIENTE
		cVarejo.addReserva(reserva1);
		cCorporativo.addReserva(reserva2);

		// IMPRIMINDO TODAS AS RESERVAS DE CADA CLIENTE
		// CLIENTE VAREJO
		System.out.println(cVarejo.getReservas());
		System.out.println("-----------------------------------------------------------------------------------");

		// CLIENTE CORPORATIVO
		System.out.println(cCorporativo.getReservas());
		System.out.println("-----------------------------------------------------------------------------------");
	
	    //ADICIONANDO MAIS UM RESERVA A UM CLIENTE
		// CLIENTE VAREJO
		ClienteVarejo cVarejo2 = new ClienteVarejo(14, "JULIANA", "(28) 99945-5695", "juliana@gmail.com", "ELO", 58944,
				"148.783.317-20");
		Reserva reserva3 = new Reserva(3, dt, assento1, assento2, cVarejo2);
		
		cVarejo2.addReserva(reserva3);
		System.out.println(cVarejo2.getReservas());
		
	
	}

}
