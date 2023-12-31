package week2.cat;

public class Cat {
    private String name;
    private double happinessLevel;

    public Cat(String name, double hl){
        this.name = name;
        this.happinessLevel = validHlLevel(hl);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHappinessLevel() {
        return happinessLevel;
    }
    public void setHappinessLevel(double happinessLevel) {
        this.happinessLevel = happinessLevel;
    }
    public double validHlLevel(double level){
        if(level >= 0.0 && level <= 5.0){
            return level; //return a valid level within the range
        }
        return 3.5; //if outiside the range, make it default to 3.5
    }

    public void pet(){
        if(happinessLevel < 5.1){
            this.happinessLevel += 0.3;
        } 
    }
    //bij de return wordt Math round gebruikt omdat na aan aantal keer aaien het een float wordt. hiermee wordt het afgerond naar 1 decimaal.
    public String checkhHappiness(){
        if(getHappinessLevel() <= 0.0 && getHappinessLevel() >= 3.5){
            return Math.round(getHappinessLevel() * 10.0) / 10.0 + ": " + getName() + " is ontvreden";
        } else if(getHappinessLevel() >= 3.6 && getHappinessLevel() <= 5.0){
            return Math.round(getHappinessLevel() * 10.0) /10.0 + ": " + getName() + " is tevreden";
        }
        return "Geen tevredensheidniveau gevonden";
    }

    
    
}
