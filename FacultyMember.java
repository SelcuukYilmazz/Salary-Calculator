//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class FacultyMember extends Personel {
    public FacultyMember(String name, String reginumber, String position, int startyear, double salary, String surname) {
        super(name, reginumber, position, startyear, salary, surname);
    }

    public FacultyMember() {
    }

//    Faculty member salary calculating here

    @Override
    public void calculate(ArrayList<Personel> personel, ArrayList<WorkingHours> workinghours,int konum,int sira,int salary,int firstweek,int secondweek,int thirdweek,int fourthweek) throws IOException {
        if(personel.get(konum).getPosition().equals("FACULTY_MEMBER")) {
            //Akademisyenler
            if (workinghours.get(sira).getFirst() - 40 >= 8) {
                firstweek += 8;
            } else {
                firstweek += workinghours.get(sira).getFirst() - 40;
            }
            if (workinghours.get(sira).getSecond() - 40 >= 8) {
                secondweek += 8;
            } else {
                secondweek += workinghours.get(sira).getSecond() - 40;
            }
            if (workinghours.get(sira).getThird() - 40 >= 8) {
                thirdweek += 8;
            } else {
                thirdweek += workinghours.get(sira).getThird() - 40;
            }
            if (workinghours.get(sira).getFourth() - 40 >= 8) {
                fourthweek += 8;
            } else {
                fourthweek += workinghours.get(sira).getFourth() - 40;
            }
            salary += 2600 + firstweek * 20 + secondweek * 20 + thirdweek * 20 + fourthweek * 20 + (2600 * 135) / 100 + (((2020 - personel.get(konum).getStartyear()) * 20) * 8) / 10;
            personel.get(konum).setSalary(salary);
            writer.write(personel.get(konum));
        }

        else{
        }
    }
}


