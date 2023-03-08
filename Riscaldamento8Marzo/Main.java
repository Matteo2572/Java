
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

    }
}
