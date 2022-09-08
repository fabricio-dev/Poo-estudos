
package questao5;

import java.util.Scanner;


public class Questao5 {

   
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       double produto;
       System.out.println("Digite o valor do produto");
       produto=teclado.nextDouble();
       System.out.println("Valor Inicial: "+produto);
       System.out.println("Valor Reajustar: "+produto*1.15);
       
    }
    
}
