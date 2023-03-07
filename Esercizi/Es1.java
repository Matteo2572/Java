
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        /*
         * (tutti, 15 minuti): Si scriva un algoritmo per un semplice gioco che chieda
         * di indovinare un codice numerico di cinque cifre.
         * Quando l'utente scrive la risposta, il programma restituisce due valori: il
         * numero di cifre al posto giusto e la somma di queste cifre.
         * Per esempio, se il codice segreto è 53840 e l'utente ipotizza 83241, le cifre
         * 3 e 4 sono al posto giusto.
         * Il programma restituisce in output i numeri 2 (cifre corrette) e 7 (somma).
         * Si permetta all'utente di provare per 10 volte.
         * (per il confronto utilizzare in un ciclo substring oppure charAt)
         */
        Scanner tastiera = new Scanner(System.in);

        String indovina = "34268";
        int nTentativi = 10;
        String tentativo = "";
        int somma = 0;
        int cfrGiuste = 0;

        for (int i = 0; i < nTentativi; i++) {
            while (tentativo.length() != indovina.length()) {
                System.out.println("Inserisci il " + i + " tentativo");
                tentativo = tastiera.nextLine();
            }
            if (indovina.equals(tentativo)) {
                System.out.println("Hai indovinato");
                break;
            } else if (indovina.charAt(i) == tentativo.charAt(i)) {
                cfrGiuste++;
                somma += indovina.charAt(i);
            }
            System.out.println(cfrGiuste + " " + somma);
        }
        
    }

}
