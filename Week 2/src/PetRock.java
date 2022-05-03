public class PetRock {

    private String naam;
    private boolean happiness=false;

    public PetRock(String naam){
        this.naam = naam;
    }

    public String getNaam(){
        return naam;
    }

    public boolean isHappy(){
        return happiness;
    }

    public void play() {
        happiness = true;
    }
}
