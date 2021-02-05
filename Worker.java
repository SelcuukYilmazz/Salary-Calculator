//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class Worker extends Personel {
    public Worker(String name, String reginumber, String position, int startyear, double salary, String surname) {
        super(name, reginumber, position, startyear, salary, surname);
    }

    public Worker() {
    }

//    Here we calculate worker salary

    @Override
    public void calculate(ArrayList<Personel> personel, ArrayList<WorkingHours> workinghours,int konum,int sira,int salary,int firstweek,int secondweek,int thirdweek,int fourthweek) throws IOException {
            if(personel.get(konum).getPosition().equals("WORKER")) {

                if (workinghours.get(sira).getFirst()-40 >= 10){
                    firstweek += 10;
                }
                else{
                    firstweek += workinghours.get(sira).getFirst()-40;
                }
                if (workinghours.get(sira).getSecond()-40 >= 10){
                    secondweek += 10;
                }
                else{
                    secondweek += workinghours.get(sira).getSecond()-40;
                }
                if (workinghours.get(sira).getThird()-40 >= 10){
                    thirdweek += 10;
                }
                else{
                    thirdweek += workinghours.get(sira).getThird()-40;
                }
                if (workinghours.get(sira).getFourth()-40 >= 10){
                    fourthweek += 10;
                }
                else{
                    fourthweek += workinghours.get(sira).getFourth()-40;
                }
                salary += firstweek*11+secondweek*11+thirdweek*11+fourthweek*11+20*105+(((2020-personel.get(konum).getStartyear())*20)*8)/10;
                personel.get(konum).setSalary(salary);
                writer.write(personel.get(konum));
            }
            else{

            }
        }
    }
