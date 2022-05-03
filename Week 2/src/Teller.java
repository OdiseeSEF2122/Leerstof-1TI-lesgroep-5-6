public class Teller {
    private int waarde = 0;
    private boolean tellerStaatAan = false;

    public Teller() {
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public boolean isTellerStaatAan() {
        return tellerStaatAan;
    }

    public void setTellerStaatAan(boolean tellerStaatAan) {
        this.tellerStaatAan = tellerStaatAan;
    }

    public void increment() {
    }
}
