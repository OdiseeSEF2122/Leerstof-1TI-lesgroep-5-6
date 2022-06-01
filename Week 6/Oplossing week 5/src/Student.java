import java.util.ArrayList;

public class Student extends Person{

    private int age;
    private ArrayList<Score> punten = new ArrayList<>();

    public Student(String name, int age) {
        super(name);
        this.age = age;
    }

    public boolean addScore(String vak, double punt){
        for(Score s: punten){
            if(s.getVak().equals(vak)){
                return false;
            }
        }

        Score s = new Score(vak, punt);
        punten.add(s);
        return true;
    }
}
