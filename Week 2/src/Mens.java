public class Mens {
    private String achternaam = "";
    private String voornaam = "";
    private int leeftijd;
    public boolean magStemmen;

    public String getAchternaam() {
        return achternaam;
    }

    public void verjaar(){
        leeftijd++;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public Mens(String achternaam, String voornaam, int leeftijd, boolean magStemmen) {
        this.achternaam = achternaam;
        this.voornaam = voornaam;
        this.leeftijd = leeftijd;
        this.magStemmen = magStemmen;
    }

    public void lach() {
        System.out.println(achternaam + " " + voornaam + " Hahahahahaha");
    }
}
