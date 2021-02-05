//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class ParttimeEmployee extends Personel {
    public ParttimeEmployee(String name, String reginumber, String position, int startyear, double salary, String surname) {
        super(name, reginumber, position, startyear, salary, surname);
    }

    public ParttimeEmployee() {
    }

//  Parttime employee salary calculating here

    @Override
    public void calculate(ArrayList<Personel> personel, ArrayList<WorkingHours> workinghours,int konum,int sira,int salary,int firstweek,int secondweek,int thirdweek,int fourthweek) throws IOException {
            if(personel.get(konum).getPosition().equals("PARTTIME_EMPLOYEE")) {

                if (workinghours.get(sira).getFirst()<10){
                    firstweek += 0;
                }
                else{
                    firstweek += 1;
                }
                if (workinghours.get(sira).getSecond() < 10){
                    secondweek += 0;
                }
                else{
                    secondweek += 1;
                }
                if (workinghours.get(sira).getThird() < 10){
                    thirdweek += 0;
                }
                else{
                    thirdweek += 1;
                }
                if (workinghours.get(sira).getFourth() < 10){
                    fourthweek += 0;
                }
                else{
                    fourthweek += 1;
                }
                salary +=firstweek*workinghours.get(sira).getFirst()*18+secondweek*workinghours.get(sira).getSecond()*18+thirdweek*workinghours.get(sira).getThird()*18+fourthweek*workinghours.get(sira).getFourth()*18+ (((2020-personel.get(konum).getStartyear())*20)*8)/10;
                personel.get(konum).setSalary(salary);
                writer.write(personel.get(konum));
            }
            else{
            }
        }
    }
