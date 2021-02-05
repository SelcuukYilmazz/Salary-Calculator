//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        FileIO fileio = new FileIO();
        Calculator calculator = new Calculator();
        ArrayList<Personel> personel = new ArrayList<Personel>();
        ArrayList<WorkingHours> workinghours = new ArrayList<WorkingHours>();

// Here we acces methods

        personel = fileio.personelreader(args[0]);
        workinghours = fileio.workingHoursreader(args[1]);
        calculator.result(personel,workinghours);

    }
}
