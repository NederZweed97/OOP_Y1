package ijsvereniging;

import java.util.ArrayList;
import java.util.List;
public class Organisation {
    private List<Subscription> members = new ArrayList<>();
    public Organisation(){}
    public List<Subscription> getMembers() {
        return members;
    }
    public void setMembers(List<Subscription> members) {
        this.members = members;
    }
    public void addMember(Subscription s){
        members.add(s);
    }

    public double getTotalProfit(){
        double profit = 0;
        for(Subscription s : members){
           profit += s.getPriceWithDiscount();
        }
        return profit;
    }
    public String getYoungestMember(){
        Person temp = members.get(0).getPerson();

        for(Subscription s : members){
            if(s.getPerson().getAge() < temp.getAge()){
                temp = s.getPerson();
            }
        }
        return temp.getFirstName() + " " + temp.getLastName();
    }

    public String getOldesttMember(){
        Person temp = members.get(0).getPerson();

        for(Subscription s : members){
            if(s.getPerson().getAge() > temp.getAge()){
                temp = s.getPerson();
            }
        }
        return temp.getFirstName() + " " + temp.getLastName();
    }

    public String getLongestSubscription(){
        Subscription temp = members.get(0);
        for(Subscription s : members){
            if(s.getYearsActive() > temp.getYearsActive()){
                temp = s;
            }
        }
        return temp.getPerson().getFirstName() + " " + temp.getPerson().getLastName();
    }






}
