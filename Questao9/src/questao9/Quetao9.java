package questao9;

import java.util.Scanner;

public class Quetao9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menor;
        int[] a = new int[16];
        for (int i = 0; i < a.length; i++) {

            System.out.println("Digite num:");
            a[i] = teclado.nextInt();

        }
        menor = a[0];

        for (int x = 0; x < a.length; x++) {

            if (a[x] < menor) {
                menor = a[x];
            }
        }
        System.out.println("Menor:"+menor);
        
        for (int i = 0; i < a.length; i++) {
            if (menor == a[i]) {
                System.out.println("posição: " + i);
            }
        }

    }

}
