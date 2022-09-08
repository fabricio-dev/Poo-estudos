package questao13;

import javax.swing.JOptionPane;

public class Questao13 {

   
    public static void main(String[] args) {
        Contador c1 = new Contador();
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite Opçao\n" + "1 - Incrementar \n" + "2 - Zerar\n" + "3 - Retomar Valor\n" + "4- Sair"));
            switch(op){
                case 1:
               c1.incremento();
               break; 
               case 2:
               c1.zerar();
               break;
               case 3:
               JOptionPane.showMessageDialog(null,c1.retomarValor());
               break;
               
                
            }
        } while (op != 4);
    }

}
