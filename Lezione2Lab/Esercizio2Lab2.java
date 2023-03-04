package Lezione2Lab;

public class Esercizio2Lab2 {
    public static void main(String[] args) {

        //tipoDati[] nomeArray = new tipoDati[dimensione];
        int[] numeri = {1, 2, 3, 4, 5};

        public static double calcolaMedia(int[] numeri) {
            double somma = 0;
            for (int i = 0; i < numeri.length; i++) {
                somma += numeri[i];
            }
            double media = somma / numeri.length;
            return media;
        }
        double media = calcolaMedia(numeri);
        System.out.println("La media dei numeri è " + media);
    }
}
