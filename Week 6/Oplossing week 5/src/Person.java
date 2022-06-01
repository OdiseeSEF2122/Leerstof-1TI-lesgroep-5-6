public class Person {

    private static int numPersons = 0;
    private final int id;
    private String naam;


    public Person(final String naam){
        id = numPersons;
        numPersons++;
        this.naam = naam;
    }

    public int getId() {
        return id;
    }
}
