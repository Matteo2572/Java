package Lezione1Lab;

import java.util.Scanner;

/**
 * @author Matteo
 *         In questa classe implemento le funzionalità di una calcolatrice sia
 *         classica che trigonometrica
 *         Operazioni classiche:
 *         1: Somma
 *         2: Differeza
 *         3: Prodotto
 *         4: Divisione
 *         Operazioni trigonometriche:
 *         5: Radice quadrata
 *         6: Seno
 *         7: Coseno
 */
public class Calcolatrice {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        boolean connessione = true;
        int sceltaOperazione;
        while (connessione) { // Finchè connection è true continuo ad usare la calcolatrice, quando diventa
                             // false viene fermata l'esecuzione
            String menu = "\n----CALCOLATRICE SCIENTIFICA---- "; // Menù per l'interfaccia con l'utente
            System.out.println(menu);
            System.out.println("1) Somma\n" +
                    "2) Differenza\n" +
                    "3) Prodotto\n" +
                    "4) Divisione\n" +
                    "5) Radice quadrata\n" +
                    "6) Seno\n" +
                    "7) Coseno\n" +
                    "Altro) EXIT\n");

            sceltaOperazione = tastiera.nextInt(); // Input da tastiera della scelta

            if (sceltaOperazione > 0 && sceltaOperazione < 5) {
                String domanda = "Inserisci n1";
                System.out.println(domanda);
                int n1 = tastiera.nextInt(); // Input da tastiera del primo numero
                String domanda2 = "Inserisci n2";
                System.out.println(domanda2);
                int n2 = tastiera.nextInt(); // Input da tastiera secondo numero
                switch (sceltaOperazione) {
                    case 1:
                        /* Sezione Somma */
                        int rSomm = n1 + n2; // Risultato Somma
                        System.out.println("Il risultato della somma é: " + rSomm); // Stampa della somma tra n1 e n2
                        break;
                    case 2:
                        /* Sezione Differenza */
                        int rDiff = n1 - n2; // Risultato Differenza
                        System.out.println("Il risultato della differenza é: " + rDiff); // Stampa della differenza tra
                                                                                         // n1 e
                                                                                         // n2
                        break;
                    case 3:
                        /* Sezione Prodotto */
                        int rProd;
                        if (n1 == 0 || n2 == 0) { // OR
                            rProd = 0; // Risultato Prodotto
                        } else {
                            rProd = n1 * n2; // Risultato Prodotto
                        }
                        System.out.println("Il risultato del prodotto è: " + rProd); // Stampa del prodotto tra n1 e n2
                        break;
                    case 4:
                        /* Sezione Divisione */
                        float rDiv;
                        if (n2 == 0) {
                            System.out.println("Errore, impossibile eseguire la divisione"); // Stampa dell'errore
                        } else if (n1 == 0) {
                            rDiv = 0; // risultatoDivisione
                            System.out.println("Il risultato della divisione è: " + rDiv); // Stampa della divisione tra
                                                                                           // n1
                                                                                           // e n2
                        } else {
                            rDiv = n1 / (float) n2;
                            System.out.println("Il risultato della divisione è: " + rDiv); // Stampa della divisione tra
                                                                                           // n1
                                                                                           // e n2
                        }
                        break;
                }
            } else if (sceltaOperazione >= 5 && sceltaOperazione < 8) {
                String domanda3 = "Inserisci n";
                System.out.println(domanda3);
                int n = tastiera.nextInt(); // Input da tastiera Numero
                switch (sceltaOperazione) {
                    case 5:
                        /* Sezione Radice Quadrata */
                        double rRadQ;
                        while (n < 0) {
                            System.out.println("Inserisci di nuovo il numero, deve essere >= 0");
                            n = tastiera.nextInt();
                        }
                        rRadQ = (Math.sqrt(n)); // Risultato radice quadrata
                        System.out.println("Il risultato della radice quadrata di n è: " + rRadQ); // Stampa della
                                                                                                   // radice
                                                                                                   // quadrata di n
                        break;
                    case 6:
                        /* Sezione Seno */
                        double rSeno;
                        double nRad = Math.toRadians(n); // Radiante di n
                        rSeno = Math.sin(nRad); // Risultato seno
                        System.out.println("Il risultato del seno di n è: " + rSeno + " Radianti: " + nRad); // Stampa
                                                                                                             // del
                                                                                                             // seno di
                                                                                                             // n
                        break;
                    case 7:
                        double rCoseno;
                        nRad = Math.toRadians(n); // Radiante di n
                        rCoseno = Math.cos(nRad); // Risultato coseno
                        System.out.println("Il risultato del coseno di n è: " + rCoseno + " Radianti: " + nRad); // Stampa
                                                                                                                 // del
                                                                                                                 // coseno
                                                                                                                 // di n
                        break;
                }
            } else {
                char risposta;
                System.out.print("Sei sicuro di voler uscire ? yY/nN \n");
                risposta = tastiera.next().charAt(0);
                if (risposta == 'n' || risposta == 'N') {
                    connessione = true;
                }else if (risposta == 'y' || risposta == 'Y') {
                    connessione = false;
                }else{
                    System.out.println("Errore");
                }

            }
            
        }System.out.print("\033[H\033[2J"); 
        System.out.flush();   
    } // end main
} // end class
