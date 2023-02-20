import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);


        String domanda = "Inserisci il nome";
        System.out.println(domanda);
        String nome = tastiera.nextLine();
        char lastChar = nome.charAt(nome.length() - 1);
        if(lastChar == 'o'){
            String domanda2 = "Inserisci l'età";
            System.out.println(domanda2);
            String risposta = tastiera.nextLine();
            System.out.println("Corretto Eta: "+ nome + risposta);
        }else{
            System.out.println("Non posso chiedere l'età");
        }
    }
}