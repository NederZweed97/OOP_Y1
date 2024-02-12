package ijsvereniging;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;



    public Person(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth= LocalDate.of(year, month, day);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(int y, int m, int d){
        this.dateOfBirth = LocalDate.of(y, m, d);
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        return(Period.between(getDateOfBirth(), now).getYears());
    }
}
