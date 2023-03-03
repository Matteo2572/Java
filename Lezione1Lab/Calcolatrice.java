package Lezione1Lab;

import java.util.Scanner;

/**
 * @author Io
 *         In questa classe implemento le funzionalità di una calcolatrice
 *         classica
 *         fondamentali:
 *         1: addizione
 *         2: sottrazione
 *         3: prodotto
 *         4: divisione
 */
public class Calcolatrice {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int sceltaOperazione;
        String menu = "----CHE OPERAZIONE VUOI ESEGUIRE---- ";
        System.out.println(menu);
        System.out.println("1) Somma\t 2) Differenza\t 3) Prodotto\t 4) Divisione\n" +
                "5) Radice quadrata\t 6) Seno\t 7) Coseno\n");

        sceltaOperazione = tastiera.nextInt();

        if (sceltaOperazione > 0 && sceltaOperazione < 5) {
            String domanda = "Inserisci n1";
            System.out.println(domanda);
            int n1 = tastiera.nextInt(); // primoNumero
            String domanda2 = "Inserisci n2";
            System.out.println(domanda2);
            int n2 = tastiera.nextInt(); // secondoNumero
            switch (sceltaOperazione) {
                case 1:
                    /* Sezione Somma */
                    int rSomm = n1 + n2; // risultatoSomma
                    System.out.println("Il risultato della somma é: " + rSomm); // stampa della somma
                    break;
                case 2:
                    /* Sezione Differenza */
                    int rDiff = n1 - n2; // risultatoDifferenza
                    System.out.println("Il risultato della differenza é: " + rDiff); // stampa della differenza
                    break;
                case 3:
                    /* Sezione Prodotto */
                    int rProd;
                    if (n1 == 0 || n2 == 0) {
                        rProd = 0;
                    } else {
                        rProd = n1 * n2; // risultatoProdotto
                    }
                    System.out.println("Il risultato del prodotto è: " + rProd); // stampa del prodotto
                    break;
                case 4:
                    /* Sezione Divisione */
                    float rDiv;
                    if (n2 == 0) {
                        System.out.println("Il risultato della divisione è: Errore, impossibile eseguire la divisione");
                    } else if (n1 == 0) {
                        rDiv = 0; // risultatoDivisione
                        System.out.println("Il risultato della divisione è: " + rDiv); // stampa della divisione
                    } else {
                        rDiv = n1 / (float) n2;
                        System.out.println("Il risultato della divisione è: " + rDiv); // stampa della divisione
                    }
                    break;
            }
        } else {
            String domanda3 = "Inserisci n";
            System.out.println(domanda3);
            int n = tastiera.nextInt(); // Numero
            switch (sceltaOperazione) {
                case 5:
                    /* Sezione Radice Quadrata */
                    double rRadQ;
                    rRadQ = (Math.sqrt(n));
                    System.out.println("Il risultato della radice di n è: " + rRadQ);
                    break;
                case 6:
                    /* Sezione Seno */
                    double rSeno;
                    double nRad = Math.toRadians(n);
                    rSeno = Math.sin(nRad);
                    System.out.println("Il risultato del seno di n è: " + rSeno + " Radianti: " + nRad); // stampa del
                                                                                                          // seno di n
                    break;
                case 7:
                    double rCoseno;
                    nRad = Math.toRadians(n);
                    rCoseno = Math.cos(nRad);
                    System.out.println("Il risultato del coseno di n è: " + rCoseno + " Radianti: " + nRad); // stampa
                                                                                                                 // del
                                                                                                                 // coseno
                                                                                                                 // di
                                                                                                                 // n1
                    break;
                default:
                    break;
            }
        }
    } // end main
} // end class
