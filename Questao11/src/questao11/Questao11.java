
package questao11;

import java.util.Scanner;


public class Questao11 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        Pixel p1=new Pixel();
        
        
        System.out.println("Digite cordenada X");
        p1.setX(teclado.nextInt());
        System.out.println("Digite cordenada y");
        p1.setY(teclado.nextInt());
        
        System.out.println("Digite quantidade de cor vermelho");
        p1.setR(teclado.nextInt());
        System.out.println("Digite quantidade de cor verde");
        p1.setG(teclado.nextInt());
        System.out.println("Digite quantidade de cor azul");
        p1.setB(teclado.nextInt());
        
        System.out.println("cordenadas X"+p1.getX()+"\nCordenanda Y"+p1.getY());
        System.out.println("Cor RGB:"+p1.getR()+p1.getG()+p1.getB());
        
        
    }
    
}
