//package Assignment22;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer extends FileIO {

// Here we create and write on files

    public void write(Personel person) throws IOException {
        FileWriter fileWriter = new FileWriter(person.getReginumber()+".txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(person);
        printWriter.close();
    }
}
