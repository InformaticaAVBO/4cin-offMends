import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Prova {
    int valore;
    String nome;

    public Prova(String nome) {
        this.valore = 10;
        this.nome = nome;
    }

    public String toString() {
        return nome + " " + valore;
    }

    public void salvaSuFile() {
        File f = new File("data/" + nome + ".txt");
        try {
            PrintWriter pw = new PrintWriter(f);
            pw.println(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
