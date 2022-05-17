package inheritance.sounds;

public class SoundProducer {

    private final String name;
    private final int id;
    private static int aantalSoundProducers = 0;

    public SoundProducer(final String name){
        this.name = name;
        id = aantalSoundProducers;
        aantalSoundProducers++;
    }

    public void makeSound(){
        System.out.print(name + "(" + id + "): ");
    }
}
