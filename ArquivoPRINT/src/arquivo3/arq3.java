package arquivo3;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class arq3 {
	public static void main(String[] args) throws IOException {
     Scanner in = new Scanner (System.in);
     
     String nome;
     int n1,n2, media;
     
	 FileWriter arq = new FileWriter("C:\\Users\\20172in025\\Documents\\media.txt");
	 PrintWriter impressaoArq = new PrintWriter(arq);
	 
	 System.out.println("Digite o nome do aluno");
	 nome = in.nextLine();
	 
	 System.out.println("Digite a primeira nota");
	 n1 = in.nextInt();
	 
	 System.out.println("Digite a segunda nota");
	 n2 = in.nextInt();
	 
	 media = (n1 + n2) /2;
	 
     
	 impressaoArq.printf("NOME DO ALUNO: %S %nNOTA 1: %d %nNOTA 2: %d %nMEDIA FINAL: %d ", nome, n1, n2, media);
     arq.close();
     
     System.out.println("\nBOLETIM GRAVADO!");
	 
		
	}
}
