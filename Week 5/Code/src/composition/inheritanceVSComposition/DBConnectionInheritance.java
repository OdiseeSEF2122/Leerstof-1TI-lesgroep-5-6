package composition.inheritanceVSComposition;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class DBConnectionInheritance extends java.net.Socket {
    /** This constructor is already present in the parent class but we still need to call it */
    public DBConnectionInheritance(String host, int port) throws IOException {
        super(host, port);
    }
    // method  OutputStream getOutputStream() also defined in parent and inherited
    public boolean dbSupports(String feature) {
        try (OutputStreamWriter DBWriter = new OutputStreamWriter(getOutputStream())){
            DBWriter.write("SELECT name FROM features WHERE name="+feature+";");
            //TODO check number of rows returned
            return (numberOfRows>0);
        } catch (IOException e) { } //TODO error handling
        return false;
    }



    private int numberOfRows=1;

    public static void main(String[] args) {
        try {
            Socket c = new DBConnectionInheritance("dbms.mijnBedrijf.net", 3344);
            OutputStreamWriter DBWriter = new OutputStreamWriter(c.getOutputStream());
                DBWriter.write("SELECT * FROM dual; DROP TABLE STUDENTS;");
            } catch (IOException e) { } //TODO error handling
        /*
        DBConnectionInheritance myConnection = new DBConnectionInheritance("dbms.mijnBedrijf.net", 3344);
        try (OutputStreamWriter DBWriter = new OutputStreamWriter(myConnection.getOutputStream())){
            DBWriter.write("SELECT * FROM dual; DROP TABLE STUDENTS;");
        } catch (IOException e) { } //TODO error handling*/
    }
}
/*
class Parent {
    public Parent() {
        System.out.println("parent ctor0");
    }
    protected Parent(String s) {
        System.out.println("parent ctor1");
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        //Parent p2=new Child();
        Parent p3=new Child("blah");

    }


}
class Child extends Parent {
    Child(String s) {
        super(s);
        System.out.println("Child Ctor1");
    }
}

 */