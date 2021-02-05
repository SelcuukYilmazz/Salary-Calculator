//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class Officer extends Personel{
    public Officer(String name, String reginumber, String position, int startyear, double salary, String surname) {
        super(name, reginumber, position, startyear, salary, surname);
    }

    public Officer() {
    }

// Officer salary calculating here

    @Override
    public void calculate(ArrayList<Personel> personel, ArrayList<WorkingHours> workinghours,int konum,int sira,int salary,int firstweek,int secondweek,int thirdweek,int fourthweek) throws IOException {
            if(personel.get(konum).getPosition().equals("OFFICER")) {

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
                salary += 2600 + firstweek*20 + secondweek*20 + thirdweek*20 + fourthweek*20 + (2600*65)/100 + (((2020-personel.get(konum).getStartyear())*20)*8)/10;
                personel.get(konum).setSalary(salary);

                writer.write(personel.get(konum));
            }
            else{
            }
        }
    }

