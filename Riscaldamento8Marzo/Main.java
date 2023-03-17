
public class Main {

    public static void main(String[] args) {
        Persona p = new Persona("Matteo", "Imbastaro");
        Persona p1 = new Persona("Simone", "Imbastaro");
        ContoCorrente conto1 = new ContoCorrente(p, 0, 0, "1234");
        ContoCorrente conto2 = new ContoCorrente(p1, 0, 0, "5678");
        conto1.deposita(1000);
        conto2.deposita(2000);
        System.out.println(conto1.toString());
        System.out.println(conto2.toString());

        int n = 5;
        int nPari = 10;
        System.out.println(fattoriale(n));
        stampaPari(nPari);
    }

        public static int fattoriale(int n){
            if (n>0) n = n * fattoriale(n-1);
            else n = 1;
            return n;
        }

        public static void stampaPari(int nPari){
            if (nPari>0) stampaPari(nPari-2);
            if (nPari%2 == 0) System.out.println(nPari);
        }
}
