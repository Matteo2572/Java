
/**
 * @author stocazzo
 * funzionamento funzioni--> dichiarazione, parametri
 * 
*/

public class EsempioFunzioni {

   /**
    * Esegue la somma
    * @param primoNumero
    * @param secondoNumero
    * @return risultato
    */
    
   public static int somma(int primoNumero,int secondoNumero){
      int risultato = primoNumero + secondoNumero;
      return risultato;
   }

   public static void main(String[] args) {
    
        int primoNumero = 6;
        int secondoNumero = 10;
        System.out.println(somma(primoNumero, secondoNumero));
   } 
}
