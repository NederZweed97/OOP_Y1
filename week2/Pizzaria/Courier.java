package week2.Pizzaria;
import java.util.ArrayList;
import java.util.List;

public class Courier {
    private String name;
    private int age;
    private double salary;
    private List<Route> routes = new ArrayList<>();
    

    public Courier(String name ,int age){
        this.name = name;
        this.age = age;
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
    public void addRoute(Route r){
        routes.add(r);
    }

    
}
