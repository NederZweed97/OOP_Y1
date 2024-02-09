package week2.Pizzaria;
import java.time.LocalDate;
import java.time.Period;

public class Courier {
    private String name;
    private int age;
    private double salary;

    

    public Courier(String name ,int day, int month, int year){
        this.name = name;
        this.age = Period.between(LocalDate.of(year, month, day), LocalDate.now()).getYears();
        this.salary = setSalary();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) { 
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public double setSalary() {
        return (age >= 6 && age <= 19) ? 4.0 : (age >= 20 && age <= 21) ? 4.75 : 5.25;
    }


    
}
