package inheritance.sounds;

// in C# is dit het dubbelpunt :
public class Mens extends SoundProducer{

    public Mens(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Ik ben een mens");
    }
}
