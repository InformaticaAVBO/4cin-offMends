import java.io.FileWriter;
import java.io.IOException;

public class Player {

    private String nome;
    private int valore;

    public Player(String nome, int valore) {
        this.nome = nome;
        this.valore = valore;
    }

    public void salvaSuFile() {
        try {
            FileWriter fw = new FileWriter(nome + ".txt");
            fw.write("Valore del player " + nome + ": " + valore);
            fw.close();
        } catch (IOException e) {
            System.out.println("Errore nella scrittura.");
        }
    }
}