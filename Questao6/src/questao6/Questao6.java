
package questao6;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, auxiliar;
        System.out.println("Digite o valor do produto");
        num = teclado.nextInt();
        
        while (num > 0) {

            auxiliar = num % 10;
            System.out.print(auxiliar);
            num = num / 10;

        }

    }
}
    

