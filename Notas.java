 
package notas;
import java.util.Scanner;
public class Notas{
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
        int[] nota = new int[10]; 
        int soma = 0;      // soma das notas para calcular a média
        double media;         // média das notas da turma
        int maior = 0;     // maior nota
        int menor = 0;     // menor nota
        int acima = 0;     // notas acima da média
        
        for (int i=0; i<=9; i = i+1){
        System.out.printf("Entre com a nota[%d]:  ", i );   
        nota[i] = ler.nextInt();
         soma = soma + nota[i];
        } // fim do for
           media = soma/10;  // a média tem que ser calculada aqui
           menor = nota[0];
           maior = nota[0];
           for(int i = 0; i < 10; i++){
            if (nota[i] > maior ){
            maior = nota[i];
            } // fim do if 
            if (nota[i] < menor ){
            menor = nota[i]; 
            }
            if (nota[i] >= 6){
              acima = acima + 1; 
            }
           } // fim do if 
             // fim do for
         System.out.printf ("Média = %1.2f \n", media);
         System.out.printf("A maior nota é %d \n", maior); 
         System.out.printf("A menor nota é %d \n", menor);
         System.out.printf("Notas maiores que a média = %d \n \n", acima);  

          
          
        
  } // aqui é o fim do método principal (main)     
}  // Aqui é o fim do programa (public class)
     

    
    

     
     
