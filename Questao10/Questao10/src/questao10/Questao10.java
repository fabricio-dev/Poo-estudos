package questao10;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Questao10 {

   
    public static void main(String[] args) {
        
        ArrayList <ContaCorrente> contaCorrent = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        Movimentacao mov = new Movimentacao(); 
        
        ContaCorrente contCorre;
        
        int opcao = 0;
        int opcao1 = 0;
        
        String nome,nomePesquisa,numConta,tipo = null;
        
        double valor = 0;
                
        do{
           opcao=menuA();
           
           
           
           switch(opcao){
               case 1:
                   
                   nome = JOptionPane.showInputDialog("Nome do titular");
                  
                   numConta = JOptionPane.showInputDialog("Numero da conta");
                   
                   tipo = JOptionPane.showInputDialog("Tipo da conta");
                   
                   contCorre = new ContaCorrente(nome, numConta, tipo);
              
        
                   if(Banco.criarConta(contCorre)){
                       System.out.println("Conta criada com sucesso");
                   }else{
                       System.out.println("Erro ao criar conta");
                   }
                   
                   break;   
               case 2:
                    System.out.println("==> Informe numero da conta");
                    numConta = teclado.nextLine();
                    
                    System.out.println("==> Informe Valor");
                    valor = teclado.nextDouble();
                    
                    if(Banco.depositar(numConta, valor)){
                        System.out.println("Deposito realizado com sucesso");
                    }else{
                        System.out.println("Erro ao depositar");
                    }
                    
                    break;
               case 3:
                   
                    System.out.println("==> Informe numero da conta");
                    numConta = teclado.nextLine();
                    
                    System.out.println("==> Informe Valor");
                    double valor1 = teclado.nextDouble();
                   
                    Banco.realizarSaque(valor, numConta);
                    
                    
                    break;
               case 4:
                     System.out.println("===> Informe numero da conta: ");
                     numConta = teclado.nextLine();
                     
                     
                     if(Banco.saldo(numConta)){
                         System.out.println("Consulta realizada com sucesso");
                     }else{
                         System.out.println("Erro ao realizar consulta");
                     }
                         
                     
                     break;
               case 5: 
                     System.out.println("===> Informe Numero da conta");
                     numConta = teclado.nextLine();
                     
                     System.out.println("===> Tipo de conta: ");
                     tipo = teclado.nextLine();
                     
                     System.out.println(Banco.strato(numConta, tipo));
                     break;
               case 6: 
                   
                   System.out.println("===> Informe numero da conta: ");
                   numConta = teclado.nextLine();
                   
                   System.out.println("==> Informe o tipo de conta (Corrente/Especial");
                   tipo = teclado.nextLine();    
                       
                   System.out.println("===> Informe Numero da conta que deseja trasferir");
                   String numConta2 = teclado.nextLine();
                   
                   System.out.println("===> Informe o valor");
                   valor = teclado.nextDouble();  
                   
                   
                   
                   if(Banco.transferencia(numConta,numConta2, valor)){
                       System.out.println("Transferencia Realizada com sucesso");
                   }else{
                       System.out.println("Erro na transferencia");
                   }
                 
                   break;
               case 7: 
                   System.out.println("===> Informe numero da conta: ");
                   numConta = teclado.nextLine();
                   if(Banco.excluir(numConta)){
                       System.out.println("Excluida com sucesso");
                   }else{
                       System.out.println("Conta não encontrada");
                   }
                   break;
               
                 
                   
           }
            
        }while(opcao!=8);
        
    }
    public static int menuA(){
        String menu="";
        
        menu="__________Menu A ____________\n"+
      "1- Criar Conta\n"+
        ("2- Depositar\n")+
        ("3- Sacar\n")+
        ("4- Saldo\n")+
        ("5- Estrato\n")+
        ("6- Transferencia\n")+
        ("7- Excluir Conta\n")+
        ("8- Sair\n")+
        (    "_____________________________\n")+
        (" Digite opção: ");
       int n =Integer.parseInt(JOptionPane.showInputDialog(null,menu));
       return n;
        
    }
    
 
   
}
 