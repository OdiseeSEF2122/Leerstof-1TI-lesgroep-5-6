package inheritance.sounds;

public class BernerSennen extends Hond{

    public BernerSennen(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("WOOF");
    }
}
