import java.util.Arrays;

public class Esercizio2Lab2 {
    public static void main(String[] args) {

        // tipoDati[] nomeArray = new tipoDati[dimensione];
        int[] numeri = { 1, 2, 3, 4, 5 };
        double media = calcolaMedia(numeri);
        System.out.println("La media dei numeri è " + media);

        int[] numeri2 = { 4, 3, 2, 5, 1, 9, 8};
        int scelta = 1;
        ordinamento(numeri2,scelta);
        String arrayOrdinato = Arrays.toString(numeri2);
        System.out.println(arrayOrdinato);
    }

    /**
     * funzione che calcola la media
     * 
     * @param numeri
     * @return media
     */
    public static double calcolaMedia(int[] numeri) {
        double somma = 0;
        for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }
        double media = somma / numeri.length;
        return media;
    }

    public static void ordinamento(int[] numeri2,int scelta){
        int n = numeri2.length;
        if (scelta == 0) { // Crescente
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (numeri2[j] > numeri2[j + 1]) {
                        int temp = numeri2[j];
                        numeri2[j] = numeri2[j + 1];
                        numeri2[j + 1] = temp;
                    }
                }
            }
        }else if (scelta == 1) { // Decrescente
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (numeri2[j] < numeri2[j+1]) {
                        int temp = numeri2[j];
                        numeri2[j] = numeri2[j+1];
                        numeri2[j+1] = temp;
                    }
                }
            }
        }else System.out.println("non è una scelta disponibile");
    }
}
