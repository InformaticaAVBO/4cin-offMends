public class Players {

    public static void main(String[] args) {

        Player p1 = new Player("Mirko", 120);
        Player p2 = new Player("Davide", 90);
        Player p3 = new Player("Sandro", 100);

        p1.salvaSuFile();
        p2.salvaSuFile();
        p3.salvaSuFile();

        System.out.println("File creati.");
    }
}