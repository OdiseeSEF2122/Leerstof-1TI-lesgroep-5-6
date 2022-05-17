package inheritance.sounds;

public class Kat extends SoundProducer{

    public Kat(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Miauw");
    }
}
