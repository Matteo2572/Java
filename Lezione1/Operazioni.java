import java.util.Scanner;

public class Operazioni {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        String domanda = "Inserisci il numero di lati";
        System.out.println(domanda);
        int lati = tastiera.nextInt();

        int perimetro = 0;

        for (int j = 0; j < lati; j++) {
            String domandaLati = "Lunghezza lato " + j;
            System.out.println(domandaLati);
            perimetro += tastiera.nextInt();
        }

        System.out.println("Il perimetro é: "+perimetro);
    }
}
