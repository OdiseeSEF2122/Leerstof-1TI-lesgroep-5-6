package polymorphism.overloading;

public class Leeftijd {
    private int jaar=java.time.LocalDate.now().getYear();
    private int maand=java.time.LocalDate.now().getMonthValue();
    private int dag=java.time.LocalDate.now().getDayOfMonth();

    public void verjaar() {
        jaar++;
    }

}
