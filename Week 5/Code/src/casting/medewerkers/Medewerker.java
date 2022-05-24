package casting.medewerkers;
import java.util.Currency;

public class Medewerker {
    public Medewerker(String naam) {
        this.naam = naam;
    }

    private String naam;
}
class BetaaldeMedewerker extends Medewerker {
    private int jarenInDienst;

    public int getJarenInDienst() {
        return jarenInDienst;
    }

    public BetaaldeMedewerker(String naam, int jarenInDienst) {
        super(naam);
        this.jarenInDienst = jarenInDienst;
    }
}
class NietBetaaldeMedewerker extends Medewerker {
    private double kostenForfeit;

    public double getKostenForfeit() {
        return kostenForfeit;
    }

    public NietBetaaldeMedewerker(String naam, double kostenForfeit) {
        super(naam);
        this.kostenForfeit = kostenForfeit;
    }
}
class Stageair extends NietBetaaldeMedewerker {
    public String getSchool() {
        return school;
    }

    public Stageair(String naam, double kostenForfeit, String school) {
        super(naam, kostenForfeit);
        this.school = school;
    }

    private String school;
}
class Bediende extends BetaaldeMedewerker {
    private double maandLoon;

    public double getMaandLoon() {
        return maandLoon;
    }

    public Bediende(String naam, int jarenInDienst, double maandLoon) {
        super(naam, jarenInDienst);
        this.maandLoon = maandLoon;
    }
}
class Arbeider extends BetaaldeMedewerker {
    private double uurLoon;

    public double getUurLoon() {
        return uurLoon;
    }

    public Arbeider(String naam, int jarenInDienst, double uurLoon) {
        super(naam, jarenInDienst);
        this.uurLoon = uurLoon;
    }
}



