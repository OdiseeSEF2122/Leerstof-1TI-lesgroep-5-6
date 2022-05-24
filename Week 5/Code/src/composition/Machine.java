package composition;

public class Machine {
    private Arbeider controleur;
    private Arbeider materiaalLeverancier;
    public Arbeider getControleur() {
        return controleur;
    }
    public void setControleur(Arbeider controleur) {
        this.controleur = controleur;
    }
    public Arbeider getMateriaalLeverancier() {
        return materiaalLeverancier;
    }
    public void setMateriaalLeverancier(Arbeider materiaalLeverancier) {
        this.materiaalLeverancier = materiaalLeverancier;
    }

    public static void main(String[] args) {
        Machine snijBot3000=new Machine();
        Arbeider Tabita=new Arbeider("Tabita");
        Arbeider Zeno=new Arbeider("Zeno");
        snijBot3000.setControleur(Tabita);
        snijBot3000.setMateriaalLeverancier(Zeno);
        Machine afgedankteSnijBot2000=new Machine();
    }
}

class Arbeider {
    private String naam;
    public Arbeider(String naam) {
        this.naam = naam;
    }
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
}