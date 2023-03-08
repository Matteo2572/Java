
public class Persona {
    /*
     * Scrivere una classe Persona(nome, cognome), aggiungere un attributo Persona
     * al ContoCorrente, aggiungere attributi numeroConto e pin.
     */

    private String nome;
    private String cognome;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
    }
}
