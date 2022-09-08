
package quetao8;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Quetao8 {

    
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        int n;
        String r="";
        n=(int)(Math.random()*5)+1;
        System.out.println(n);
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite N" ));
        for(int i=1;i<=n;i++){
           for(int x=1;x<=i;x++){
            r=r+i+" ";   
                
           } 
            r=r+"\n";
           
            }
        JOptionPane.showMessageDialog(null, r);
    }
    
}
