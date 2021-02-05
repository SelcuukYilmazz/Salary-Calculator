//package Assignment22;

import java.io.IOException;
import java.util.ArrayList;

public class Personel {
    private String name;
    private String surname;
    private String reginumber;
    private String position;
    private int startyear;
    private double salary;
    Writer writer = new Writer();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReginumber() {
        return reginumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStartyear() {
        return startyear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Personel(String name, String reginumber, String position, int startyear, double salary,String surname) {
        this.name = name;
        this.reginumber = reginumber;
        this.position = position;
        this.startyear = startyear;
        this.salary = salary;
        this.surname = surname;
    }
    public String toString(){
        return "Name : "+ name +"\n"+ "Surname : "+ surname +"\n"+ "Registiration Number : "+ reginumber +"\n"+"Position : "+ position +"\n"+ "Year of Start : "+ startyear +"\n"+"Total Salary : " + salary + "0 TL";
    }

    public Personel() {
    }

// This empty method is overriding so we can arrange code easily

    public void calculate(ArrayList<Personel> personel, ArrayList<WorkingHours> workinghours,int konum,int sira,int salary,int firstweek,int secondweek,int thirdweek,int fourthweek) throws IOException {
    }
}
