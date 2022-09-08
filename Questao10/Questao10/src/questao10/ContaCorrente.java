package questao10;


public class ContaCorrente {

    private String nome;
    private String numConta;
    private double saldo;
    private double limite = 1000;
    private String status;
    private Movimentacao movimenta;
    
    public ContaCorrente(String nome, String numeroConta, String status) {
        this.nome = nome;
        this.numConta = numeroConta;
        this.status = status;
    }


    
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    public double depositar(double valor){
        return this.saldo+=valor;
    }
    
    public boolean sacarContaCorrente(double valor){
        if((this.saldo - valor)>=0){
            saldo-=valor;
            return true;
        }
        return false;
    }
    
    public boolean sacarContaEspecial(double valor){
     double saldoComLimite = this.getSaldo() + limite;
        if((saldoComLimite - valor)>=0){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
        return false;
    }
    

}
