
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

        String domanda = "Inserisci n1";
        System.out.println(domanda);
        int n1 = tastiera.nextInt(); // primoNumero

        String domanda2 = "Inserisci n2";
        System.out.println(domanda2);
        int n2 = tastiera.nextInt(); // secondoNumero

        /* Sezione Somma */
        int rSomm = n1 + n2; // risultatoSomma
        System.out.println("Il risultato della somma é: " + rSomm); // stampa della somma

        /* Sezione Differenza */
        int rDiff = n1 - n2; // risultatoDifferenza
        System.out.println("Il risultato della differenza é: " + rDiff); // stampa della differenza

        /* Sezione Prodotto */
        int rProd;
        if (n1 == 0 || n2 == 0) {
            rProd = 0;
        } else {
            rProd = n1 * n2; // risultatoProdotto
        }
        System.out.println("Il risultato del prodotto è: " + rProd); // stampa del prodotto

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

        /* Sezione Seno n1 */
        double rSenoN1;
        double n1Rad = Math.toRadians(n1);
        rSenoN1 = Math.sin(n1Rad);
        System.out.println("Il risultato del seno di n1 è: " + rSenoN1+" Radianti: "+n1Rad); // stampa del seno di n1

        /* Sezione Seno n2 */
        double rSenoN2;
        double n2Rad = Math.toRadians(n2);
        rSenoN2 = Math.sin(n2Rad);
        System.out.println("Il risultato del seno di n2 è: " + rSenoN2 +" Radianti: "+n2Rad); // stampa del seno di n2

        /* Sezione Coseno n1 */
        double rCosenoN1;
        rCosenoN1 = Math.cos(n1Rad);
        System.out.println("Il risultato del coseno di n1 è: " + rCosenoN1 +" Radianti: "+n1Rad); // stampa del coseno di n1

        /* Sezione Coseno n2 */
        double rCosenoN2;
        rCosenoN2 = Math.cos(n2Rad);
        System.out.println("Il risultato del coseno di n2 è: " + rCosenoN2 +" Radianti: "+n2Rad); // stampa del coseno di n2

    } // end main
} // end class
