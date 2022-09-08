
package questao7;

import java.util.Scanner;


public class Questao7 {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int x,y;
        System.out.println("Digite X");
        x = teclado.nextInt();
        System.out.println("Digite Y");
        y = teclado.nextInt();
        System.out.println("Resultado:"+Math.pow(x,y));
    }
    
}
