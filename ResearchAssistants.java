//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class ResearchAssistants extends Personel{
    public ResearchAssistants(String name, String reginumber, String position, int startyear, double salary, String surname) {
        super(name, reginumber, position, startyear, salary, surname);
    }

    public ResearchAssistants() {
    }

//    Here we calculate research assistant salary

    @Override
    public void calculate(ArrayList<Personel> personel, ArrayList<WorkingHours> workinghours,int konum,int sira,int salary,int firstweek,int secondweek,int thirdweek,int fourthweek) throws IOException {
            if(personel.get(konum).getPosition().equals("RESEARCH_ASSISTANTS")) {

                salary += 2600 + (2600*105)/100 + (((2020-personel.get(konum).getStartyear())*20)*8)/10;
                personel.get(konum).setSalary(salary);
                writer.write(personel.get(konum));
            }
            else{
            }
        }
    }

