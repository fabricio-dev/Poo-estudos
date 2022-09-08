package questao15;

import javax.swing.JOptionPane;

public class Questao15 {

    public static void main(String[] args) {
        Frase p1 = new Frase();
       
            
            
        
        p1.setPalavra(JOptionPane.showInputDialog(null, "Digite Frase"));
        
        p1.invertida();
        if(p1.isPalindromo(p1.getPalavra())){
        JOptionPane.showMessageDialog(null, "É palidromo" );
        }
        else{
         JOptionPane.showMessageDialog(null, "Nao É palidromo" );   
        }
        System.out.println(p1.isPalindromo(p1.getPalavra()));
        
        
     
        
    }}

    


