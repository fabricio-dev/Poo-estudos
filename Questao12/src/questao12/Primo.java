package questao12;

public class Primo {

    public static boolean ehPrimo(int n) {
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont += 1;
            }
            if (n == 2) {
                cont = 2;
            }

        }
        return (cont == 2);
    }

    public static int getPrimo(int n) {
        int cont1 = -1;
        int cont2 = -1;
        int result=0;
        for (int i = n + 1;; i++) {
            cont1 += 1;
            if (ehPrimo(i) == true) {
                break;
            }
            
        }

        for (int x=n; ; x--) {
            cont2 += 1;
            if (ehPrimo(x)) {
                break;
            }
            
        }

        if (cont1 < cont2) {
            for (int i = n + 1;; i++) {
                if (ehPrimo(i)) {
                    result= i;
                    break;
                }

            }
        }else{
            
            for (int x = n - 1; x > 0; x--) {
                if (ehPrimo(x)) {
                    result= x;
                    break;
                }
            }
        }
        return result;
    }
}

