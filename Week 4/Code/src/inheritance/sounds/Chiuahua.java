package inheritance.sounds;

public class Chiuahua extends Hond{

    public Chiuahua(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("woof");
    }
}
