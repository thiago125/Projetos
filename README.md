

/* Sistema de levantamento de estoque 
 *  
 *
*/
package estoques;
import java.util.Scanner;
/*
 *
 * @author thiago
 */
public class Estoques {
 public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      String[] nome = new String[50];
      int[] quantidade = new int[50];
      double[] custo = new double[50];
      double[] valor = new double[50];
      double total = 0 ;
      double guarda;
      int i = 0;
      int lidos = 0;
      int continua = 1;
      while (continua == 1 && i <= 50){
         System.out.printf("Nome: ");
         nome[i] = ler.nextLine();
         System.out.printf("Quantidade: ");
         quantidade[i] = ler.nextInt();       
         System.out.printf("preco: ");
         custo[i] = ler.nextDouble();
         valor[i]=custo[i]*quantidade[i];    
         total= total+ valor[i];
         System.out.printf("Valor %f \n", valor[i]);
         System.out.printf("Digite 1 para continuar");
         continua=ler.nextInt();
         ler.nextLine();
         lidos++;         
      }
      System.out.printf("\n\nNome          Preço      quantidade      Valor \n");
      System.out.printf("---------------------------------------------- \n " );
      for (int j = 1; j <=lidos; j++){
         System.out.printf("%s %15.2f  %11d %15.2f  \n" ,nome[i],custo[i], quantidade[i], valor[i]);


      }
      System.out.printf("----------------------------------------------\n");
      System.out.printf(" Valor R$ %f ",total);

    }
    
}

