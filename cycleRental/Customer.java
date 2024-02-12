package cycleRental;
import java.time.LocalDate;
import java.time.Period;

public class Customer {
    private String name;
    private LocalDate dateOfBirth;

    public Customer(String name, int year, int month, int day){
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }





}
