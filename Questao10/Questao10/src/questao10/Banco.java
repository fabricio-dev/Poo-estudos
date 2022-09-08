package questao10;

import java.util.ArrayList;

public class Banco {
    
   private static ArrayList <ContaCorrente> contaCorrente =new ArrayList();
   private Movimentacao mov = new Movimentacao();
   
    public static ArrayList<ContaCorrente> getContaCorrente() {
        return contaCorrente;
    }

   
    static public boolean criarConta(ContaCorrente conta){
       contaCorrente.add(conta);
       return true;
    }
    static boolean depositar(String numero, double valor){
        for(ContaCorrente ct :contaCorrente ){
            if(ct.getNumeroConta().equals(numero)){
                ct.depositar(valor);
                return true;
            }
        }
        return false;
    }
    static public boolean saldo(String numero) {
           for(ContaCorrente ct :contaCorrente ){
               if(ct.getNumeroConta().equals(numero)){
                   System.out.println("Nome do titular: "+ct.getNome());
                   System.out.println("Numero da conta: "+ct.getNumeroConta());
                   System.out.println("Saldo: "+ct.getSaldo());
                   System.out.println("Status: "+ct.getStatus());
                   if(ct.getStatus().equalsIgnoreCase("Especial")){
                       System.out.println("Limite: "+ct.getLimite());
                   }
                    return true;
               }
              
           } 
           return false;
        } 
    static public void realizarSaque(double valor, String numero) {
        for (ContaCorrente ct : contaCorrente) {
            if (ct.getNumeroConta().equals(numero)) {
                if (ct.sacarContaCorrente(valor)) {
                    System.out.println("Saque efetuado com sucesso");
                } else {
                    System.out.println("Saldo insuficiente para saque de = " + valor + " saldo de = " + ct.getSaldo());
                }
            } else if (ct.getNumeroConta().equalsIgnoreCase(numero)) {
                if (ct.sacarContaEspecial(valor)) {
                    System.out.println("Saque efetuado com sucesso");
                } else {
                    System.out.println("Saldo insuficiente para saque de = " + valor + " saldo de = " + ct.getSaldo());
                }
            }

        }

    }
   
   
   static public String strato(String numero, String tipo){
        String lista = "";
        
        int i = 1;
        for(ContaCorrente ct: contaCorrente){
            if(ct.getNumeroConta().equalsIgnoreCase(numero)){
                 System.out.println("Nome: "+ct.getNome());
                 System.out.println("Numero da conta: "+ct.getNumeroConta());
                 System.out.println("Status: "+ct.getStatus());
                 if(tipo.equalsIgnoreCase("Especial")){
                     System.out.println("Limite: "+ct.getLimite());
                 }
            }
           
        }
        return lista;
    }
   static public boolean excluir(String numero){
       for(ContaCorrente ct : contaCorrente){
           if(ct.getNumeroConta().equalsIgnoreCase(numero)){
               contaCorrente.remove(ct);
               return true;
           }
       }
       return false;
   }   
   static public boolean transferencia(String numero,String numero2, Double valor){
       for(ContaCorrente contCorre : contaCorrente){
         if(contCorre.getNumeroConta().equalsIgnoreCase(numero)){
              if(contCorre.getStatus().equalsIgnoreCase("Corrente")){
                  contCorre.sacarContaCorrente(valor);
              }else if(contCorre.getStatus().equalsIgnoreCase("Especial")){
                  contCorre.sacarContaEspecial(valor);
              }
              depositar(numero2, valor);
              return true;
           }
       }
       return false;
   }
   
}
