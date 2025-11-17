
public class Coppia {
    private Integer primo;
    private Integer secondo;

    public Coppia( Integer primo, Integer secondo ) {
        this.primo = primo;
        this.secondo = secondo;
    }

    public Integer getPrimo() {
        return primo;
    }

    public Integer getSecondo() {
        return secondo;
    }

    @Override
    public String toString() {
        return "Coppia: \n" + "-il primo è " + primo + ";\n -il secondo è " + secondo + "." ;
    }
}
