
package questao13;


public class Contador {
   private int valor;
  
// poderia somente ser usado os get e set para as funcionalidades
    //public void setValor(int valor) {
      //  this.valor = valor;
    //}
    //public int getValor() {
     //   return valor;
    //}
    public void incremento(){
      this.valor++;
    }
    public int retomarValor (){
        return valor;
    }
    public void zerar(){
        valor=0;
    }
}
