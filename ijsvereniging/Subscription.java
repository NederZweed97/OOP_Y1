package ijsvereniging;
import java.time.LocalDate;
import java.time.Period;
public class Subscription {
    private Person person;
    private LocalDate registrationDate;

    public Subscription(int day, int month, int year, Person person){
        this.person = person;
        this.registrationDate = LocalDate.of(year, month, day);
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    public double getContribution(){
        int age = person.getAge();
        if(age < 12){
            return 5.0;
        } else if (age >= 12 && age < 18 ) {
            return 7.50;
        } else if(age > 65){
            return 30.35;
        }
        return 10;
    }

    public int getYearsActive(){
        return Period.between(getRegistrationDate(), LocalDate.now()).getYears();
    }
    public double getPriceWithDiscount(){
        int yearsActive =  getYearsActive();
        if(yearsActive> 5 ){
            return getContribution() * 0.8;
        }
        return getContribution();
    }
}







