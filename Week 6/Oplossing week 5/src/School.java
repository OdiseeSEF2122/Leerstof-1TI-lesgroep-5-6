import java.util.ArrayList;

public class School {

    private ArrayList<Person> personen = new ArrayList<>();

    public boolean personExists(Person person){
        for (Person p : personen){
            if (p.getId() == person.getId()) {
                return true;
            }
        }
        return false;
    }

    private Person findPerson(int id){
        for (Person p : personen){
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean isDocent(int id){
        return findPerson(id) instanceof Docent;
    }

    public boolean isStudent(int id){
        return findPerson(id) instanceof Student;
    }

    /**
    This is aggregation
     */
    public boolean addPerson(Person person){
        if(!personExists(person)){
            personen.add(person);
            return true;
        }
        return false;
    }

    /**
    This is composition
     */
    public Integer addDocent(String name, String opleiding){
        Docent d = new Docent(name, opleiding);
        if(addPerson(d)){
            return d.getId();
        }

        return null;
    }

    public Integer addStudent(String name, int age){
        Student s = new Student(name, age);
        if(addPerson(s)){
            return s.getId();
        }

        return null;
    }

    public boolean addScore(int docentId, int studentId, String vak, double punt){
        // controleer of de docent bestaat
        if(!isDocent(docentId) || !isStudent(studentId)){
            return false;
        }

        Student s = (Student)findPerson(studentId);
        return s.addScore(vak, punt);
    }
}
