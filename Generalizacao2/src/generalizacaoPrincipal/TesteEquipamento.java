package generalizacaoPrincipal;
import generalizacao3.*;

public class TesteEquipamento {
	public static void main(String[] args) {
     
		Motor motor1 = new Motor("BMW", "BMW M240i", 2017, (double) 120.000, "300.0 km", "600CV" );
		
		System.out.println(motor1.toString());
		
		System.out.println("----------------------------------------------------------------------------");
		
		Bomba bomba1 = new Bomba ("Shell", "Shell 2.0", 2014, (double)1500.00, "5 psi" ,"10 psi", "1,38 m3/h");
		System.out.println(bomba1.toString());
		
		System.out.println("------------------------------------------------------------------------------");
		
		motor1.setMarca("Volkswagen");
		System.out.println(motor1.getMarca());
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println(motor1.toString());
		
		System.out.println("--------------------------------------------------------------------------------");
		
		bomba1.setMarca("Valscap");
		System.out.println(bomba1.getMarca());
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println(bomba1.toString());
	}
}
