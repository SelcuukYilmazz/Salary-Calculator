//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class Calculator extends Writer {
    ParttimeEmployee parttime = new ParttimeEmployee();
    Chief chief = new Chief();
    FacultyMember facultyMember = new FacultyMember();
    Officer officer = new Officer();
    ResearchAssistants research = new ResearchAssistants();
    Security security = new Security();
    Worker worker = new Worker();

    //          Here we acces all overrided methods and calculating salaries

    public void result(ArrayList<Personel> personel,ArrayList<WorkingHours> workinghours) throws IOException {
        for (int i = 0; i < personel.size(); i++) {
            int konum = i ;
            int sira = 0;
            int salary = 0;
            int firstweek = 0;
            int secondweek = 0;
            int thirdweek = 0;
            int fourthweek = 0;

                for (int k = 0; k < workinghours.size(); k++) {
                    if (workinghours.get(k).getReginumber().equals(personel.get(i).getReginumber())) {
                        sira = sira + k;
                        break;
                    }
                }
            parttime.calculate(personel,workinghours,konum,sira,salary,firstweek,secondweek,thirdweek,fourthweek);
            chief.calculate(personel,workinghours,konum,sira,salary,firstweek,secondweek,thirdweek,fourthweek);
            facultyMember.calculate(personel,workinghours,konum,sira,salary,firstweek,secondweek,thirdweek,fourthweek);
            officer.calculate(personel,workinghours,konum,sira,salary,firstweek,secondweek,thirdweek,fourthweek);
            research.calculate(personel,workinghours,konum,sira,salary,firstweek,secondweek,thirdweek,fourthweek);
            security.calculate(personel,workinghours,konum,sira,salary,firstweek,secondweek,thirdweek,fourthweek);
            worker.calculate(personel,workinghours,konum,sira,salary,firstweek,secondweek,thirdweek,fourthweek);
        }
    }
}

