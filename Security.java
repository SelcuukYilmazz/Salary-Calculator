//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class Security extends Personel {
    public Security(String name, String reginumber, String position, int startyear, double salary, String surname) {
        super(name, reginumber, position, startyear, salary, surname);
    }

    public Security() {
    }

//    Here we calculate Security salary

    @Override
    public void calculate(ArrayList<Personel> personel, ArrayList<WorkingHours> workinghours,int konum,int sira,int salary,int firstweek,int secondweek,int thirdweek,int fourthweek) throws IOException {
            if(personel.get(konum).getPosition().equals("SECURITY")) {

                if (workinghours.get(sira).getFirst()<30){
                    firstweek += 0;
                }
                else{
                    firstweek += 1;
                }
                if (workinghours.get(sira).getSecond() < 30){
                    secondweek += 0;
                }
                else{
                    secondweek += 1;
                }
                if (workinghours.get(sira).getThird() < 30){
                    thirdweek += 0;
                }
                else{
                    thirdweek += 1;
                }
                if (workinghours.get(sira).getFourth() < 30){
                    fourthweek += 0;
                }
                else{
                    fourthweek += 1;
                }
                salary += firstweek*15*6+firstweek*workinghours.get(sira).getFirst()*10+secondweek*15*6+secondweek*workinghours.get(sira).getSecond()*10+thirdweek*15*6+thirdweek*workinghours.get(sira).getThird()*10+fourthweek*15*6+fourthweek*workinghours.get(sira).getFourth()*10+ (((2020-personel.get(konum).getStartyear())*20)*8)/10;
                personel.get(konum).setSalary(salary);
                writer.write(personel.get(konum));
            }
            else{
            }
        }
    }

