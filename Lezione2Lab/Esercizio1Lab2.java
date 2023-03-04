package Lezione2Lab;

import java.util.Scanner;

public class Esercizio1Lab2{
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int iteratore = 5;
        int somma = 0;
        for (int i = 0; i < iteratore; i++) {
            System.out.println("\n inserisci un numero");
            int n = tastiera.nextInt();
            somma += n;
            System.out.println("la somma è: "+somma);
        }
        int somma2 = 0;
        int i = 0;
        while(i < iteratore){
            System.out.println("\n inserisci un numero");
            int n = tastiera.nextInt();
            somma2 += n;
            System.out.println("la somma è: "+somma2);
            i++;
        }
        int somma3 = 0;
        i = 0;
        do{
            System.out.println("\n inserisci un numero");
            int n = tastiera.nextInt();
            somma3 += n;
            System.out.println("la somma è: "+somma3);
            i++;
        }while(i < iteratore);

        
        
    }
}
