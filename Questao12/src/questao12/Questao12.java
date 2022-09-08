
package questao12;

import javax.swing.JOptionPane;


public class Questao12 {

  
    public static void main(String[] args) {
       int n;
        n =Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        JOptionPane.showMessageDialog(null,Primo.getPrimo(n));
        
   
    
}}
