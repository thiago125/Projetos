package arquivo;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Arq {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String nome;

		System.out.println("Informe o nome que devera ser gravado no arquivo");
		nome = in.nextLine();
		
		FileWriter arq = new FileWriter("C:\\Users\\20172in025\\Documents\\Nome.txt", true);
	    PrintWriter impressaoArq = new PrintWriter(arq);
	    
	    impressaoArq.printf("O NOME DIGITADO É: %S %n", nome);
	    arq.close();
	    System.out.printf("\n O nome %S foi gravado com sucesso em C:\\Users\\20172in025\\Documents\\Nome.txt", nome);
	
	}

}
