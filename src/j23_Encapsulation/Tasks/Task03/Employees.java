package j23_Encapsulation.Tasks.Task03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employees {//outher Class level
   private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public Employees() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {return yasKontrol();}
    public int ageCalculator(){//yaş return eden method
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Period.between(LocalDate.parse(dob,dtf), LocalDate.now()).getYears();
    }
    public String  yasKontrol(){
        if (ageCalculator()>18) {
            return "Welcome to our company "+name+" your salary is "+salary;
        } else if (ageCalculator()<18) {
            return "come back when you are 18 years old";
        }else return  "we can have inter with you after that you can have a "+ salary+" salary";
    }
}//outher class sonu

class  Runner {//inner class level
    public static void main(String[] args) {
        Employees obj1=new Employees("Enes",55000,"07/12/1988");
        System.out.println("obj1 = " + obj1);
        Employees obj2=new Employees("Fatma",99000,"28/06/1990");
        System.out.println("obj2 = " + obj2);


    }
}//inner class sonu
