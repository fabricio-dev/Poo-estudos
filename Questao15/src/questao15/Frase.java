package questao15;

public class Frase {

    private String palavra = "";
    private String invertida = "";

    public String getPalavra() {
        return palavra;
    }
    

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void invertida() {
        this.palavra = this.palavra.replaceAll(" ", "");

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida = invertida + palavra.charAt(i);
        }

    }

    public boolean isPalindromo(String palavra) {
        return palavra.equalsIgnoreCase(invertida);
    }
}
