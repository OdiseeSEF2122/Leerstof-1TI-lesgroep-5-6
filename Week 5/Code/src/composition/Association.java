package composition;

import java.util.List;

public class Association {
    class Course {
        private Person teacher;
        private List<Person> pupils;
    }


    public static void main(String[] args) {
        Person teacher = new Person();
        Person Elias = new Person();
        teacher.scores(Elias,"Software Engineering Fundamentals",16);

        SomeIntegerClass myBadInt=new SomeIntegerClass();
        myBadInt.setOtherTerm(5);
        myBadInt.addition();
        myBadInt.setOtherTerm(6);
        myBadInt.addition();

        SomeIntegerClass myGoodInt=new SomeIntegerClass();
        myGoodInt.addition(5);
        myGoodInt.addition(6);

    }
}
class SomeIntegerClass {
    protected Integer value=0;
    public void addition(Integer theOtherTerm) {
        value+=theOtherTerm;
    }

    private Integer otherTerm;
    public void setOtherTerm(Integer otherTerm) {
        this.otherTerm = otherTerm;
    }
    public void addition() {
        value+=otherTerm;
    }




}
