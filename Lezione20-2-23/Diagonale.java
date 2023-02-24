import java.util.Scanner;


public class Diagonale {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        String domanda = "Inserisci la base";
        System.out.println(domanda);
        int base = tastiera.nextInt();

        String domanda2 = "Inserisci l'altezza";
        System.out.println(domanda2);
        int altezza = tastiera.nextInt();

        double diagonale = Math.sqrt(Math.pow(base, 2)+(Math.pow(altezza, 2)));
        System.out.println(diagonale);
    }
}
