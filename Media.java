import java.util.*;
public class Media {
 public static void main (String []args){
  Scanner ler = new Scanner (System.in);
   double n1;
   double n2;
   double n3;
   double media; 
   do{ System.out.print("Entre com a nota 1:  ");
   n1 = ler.nextDouble();
   }while(n1 < 0 || n1 > 10 ); 
   do{ System.out.print("Entre com a nota 2:  ");
   n2 = ler.nextDouble();
   }while(n2 < 0 || n2 > 10);
   do{ System.out.print("Entre com a nota 3:  ");
   n3 = ler.nextDouble();
   }while(n3 < 0 || n3 > 10);
   media = (n1 + n2 + n3)/3;
   System.out.printf("A media do aluno é = %2.2f \n", media);
   if (media >= 7) { 
     System.out.printf("O aluno está aprovado \n"); 
     }else if(media < 4) {
      System.out.printf("O aluno está reprovado \n");
     }else {
    	System.out.printf("O aluno está de recuperação \n \n");
    
     } 
 }

}