package questao10;


public class Movimentacao {
    
    private String descricao;
    private double valor;
    private String informacao;


    public String getDescricao() {
        return descricao;
    }

   
    public double getValor() {
        return valor;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

   

    @Override
    public String toString() {
        return "Movimentacao\n" + "\nDescricao = " +this.getDescricao() + "\nValor = " + this.getValor() + "\nInformacao da Conta =" 
                + this.getInformacao();
    }
    
    
    
    
}
