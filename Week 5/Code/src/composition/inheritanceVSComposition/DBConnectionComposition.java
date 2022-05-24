package composition.inheritanceVSComposition;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class DBConnectionComposition {
    java.net.Socket connection;
    public DBConnectionComposition(String host,int port) {
        try {
            connection = new java.net.Socket(host,port);
        } catch(Exception e) { }//TODO error handling
    }
    public OutputStream getOutputStream() throws IOException {
        return connection.getOutputStream();
    }
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
        DBConnectionComposition myConnection = new DBConnectionComposition("dbms.mijnBedrijf.net", 3344);
        try (OutputStreamWriter DBWriter = new OutputStreamWriter(myConnection.getOutputStream())){
            DBWriter.write("SELECT * FROM dual; DROP TABLE STUDENTS;");
        } catch (IOException e) { } //TODO error handling
    }
}
