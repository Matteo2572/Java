
import java.util.Scanner;

public class ContoCorrente {
    /*
     * scrivere la classe ContoCorrente con l'attributo String nome, String cognome
     * e i metodi preleva e deposita.
     * Non è possibile prelevare/depositare un numero negativo e non si può
     * prelevare se non ci sono abbastanza soldi.
     * I controlli devono essere fatti all'interno di preleva e deposita.
     */
    Scanner tastiera = new Scanner(System.in);
    private Persona p;
    private double saldo;
    private int numeroConto;
    private String pin;
    private static int prossimoNumero = 0;
    private final static String NOME_BANCA = "Unicredit";

    public ContoCorrente(Persona p, double saldo, int numeroConto, String pin) {
        this.p = p;
        this.saldo = saldo;
        this.numeroConto = prossimoNumero++;
        this.pin = pin;
    }

    public Persona getP() {
        return p;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getPin() {
        return pin;
    }

    public static int getProssimoNumero() {
        return prossimoNumero;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public static void setProssimoNumero(int prossimoNumero) {
        ContoCorrente.prossimoNumero = prossimoNumero;
    }

    @Override
    public String toString() {
        return "ContoCorrente [p=" + p + ", saldo=" + saldo + ", numeroConto=" + numeroConto + ", pin=" + pin + "]";
    }

    public void preleva(int soldiPrelevati) {
        if (saldo > 0) {
            if (soldiPrelevati > 0 && soldiPrelevati < saldo) {
                saldo -= soldiPrelevati;
            }
            System.out.println("Saldo corrente: " + saldo);
        } else {
            System.out.println("Non puoi prelevare, non ci sono soldi");
        }
    }

    public void deposita(int soldiDepositati) {
        if (soldiDepositati > 0) {
            saldo += soldiDepositati;
        }
        System.out.println("Saldo corrente: " + saldo);
    }
}
