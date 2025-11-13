import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

public class App {

    public static void copyFile(String fileIn, String fileOut) {
        File f = new File(fileIn);

        Scanner leggi = new Scanner(f);

        FileWriter scrivi = new FileWriter(fileOut);

        while(leggi.hasNextLine()){
            String s = leggi.nextLine();
            scrivi.write(s);
        }
        leggi.close();
        scrivi.close();
    }
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi il nome del file sorgente: ");

        String nomeSorgente = scanner.nextLine();

        System.out.println("Dammi il nome del file di destinazione: ");
        
        String nomeDestinazione = scanner.nextLine();

        scanner.close();

        File f = new File(nomeSorgente);
        Scanner leggi = new Scanner(f);

        FileWriter scrivi = new FileWriter(nomeDestinazione);

        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            scrivi.write(s);
        }
        
        scrivi.close();
        leggi.close();

        System.out.println("Fine della copia di " + nomeSorgente + ".");

        copyFile()
    }
}
