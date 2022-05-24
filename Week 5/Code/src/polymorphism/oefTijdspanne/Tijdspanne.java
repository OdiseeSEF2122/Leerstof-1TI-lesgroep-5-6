package polymorphism.oefTijdspanne;

public class Tijdspanne {
    protected int minuten;
    public Tijdspanne(int minuten) {
        this.minuten = minuten;
    }
    public int getMinuten() {
        return minuten;
    }
    public void bijTellen(Tijdspanne andere) {

        this.minuten+=andere.getMinuten();
    }
}
class PreciezeTijdspanne extends Tijdspanne {
    protected int seconden;
    public int getSeconden() {
        return seconden;
    }
    public PreciezeTijdspanne(int minuten, int seconden) {
        super(minuten);
        this.seconden = seconden;

    }
    public void bijTellen(PreciezeTijdspanne andere) {
        super.bijTellen(andere);
        this.seconden+=andere.getSeconden();
    }
}
