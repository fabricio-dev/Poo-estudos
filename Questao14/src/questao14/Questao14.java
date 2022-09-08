package questao14;

import javax.swing.JOptionPane;

public class Questao14 {

    public static void main(String[] args) {
        int num,impares=0;
        double face6=0.0;
    String imprime="";
        int cont[] = {0, 0, 0, 0, 0,0};
        for (int j = 0; j < 80; j++) {
            num = (int) ((Math.random() * 6) + 1);
           
            for (int x = 0; x < 6; x++) {

                if (num == x + 1) {
                    cont[x]++;
                }
            }

        }
        impares=cont[0]+cont[2]+cont[4];
        face6=(double)(cont[5]*100/80);
        for (int j = 0; j < 6; j++) {
            
            imprime=imprime+"Face "+(j+1)+": "+cont[j]+"\n";
           
        }
        imprime=imprime+"Impares: "+impares+"\nPorcentagem 6: "+face6;
        JOptionPane.showMessageDialog(null,imprime);
        
         /*for (int i = 0; i <= 80; i++) {
            switch ((int) ((Math.random() * 7) + 1)) {
                case 1:
                    a1++;
                    break;
                case 2:
                    a2++;
                    break;
                case 3:
                    a3++;
                    break;
                case 4:
                    a4++;
                    break;
                case 5:
                    a5++;
                    break;
                case 6:
                    a6++;
                    break;
            }
        }*/
        
    }

}
