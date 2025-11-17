public class Persona {
    String nome, cognome;

    public Persona (String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString(){
        return "Ciao sono " + nome + " " + cognome + ".";
    }
}
