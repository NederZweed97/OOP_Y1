package week2.parking;
import java.util.List;
import java.util.ArrayList;

public class Garage {
    private String name;
    private String addres;
    private int maxCapacity;
    private List<Car> cars = new ArrayList<>();

    public Garage(String name, String addr, int mc){
        this.name = name;
        this.addres = addr;
        this.maxCapacity = mc;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int countWhiteCars(){
        int count = 0;
        for(Car c : cars){
            if(c.getColor().toLowerCase().contains("white")){
                count++;
            }
        }
        return count;
    }

    public boolean validatePlate(String lp){
        String temp = lp.replaceAll("-", "");
        boolean valid = temp.length() == 6 && !"xx-xx-xx".equals(lp);
        return valid;
    }

    public String parkCar(Car c){
        if(validatePlate(c.getLisencePlate())){
            if(this.cars.size() < getMaxCapacity()){
                if(c.getColor().toLowerCase().contains("white")){
                    if(countWhiteCars() < 41){
                        this.cars.add(c);
                        return "Welkom, geniet van uw bezoek";   
                    } else{
                        return "Geen plek voor witte auto's, probeer later opnieuw"; // WHAT, okej.. if you say so.
                    }
                } else{
                    this.cars.add(c);
                    return "Welkom, geniet van uw bezoek";
                }
            } else{
                return "Sorry, parkeergarage vol. Probeer later opnieuw";
            }
        }else {
            return "Geen geldig kenteken gevonden, controleer uw kenteken of neem contact op";
        }   
    }



    public void outOfGarage(Car c){
        this.cars.remove(c);
    }

    public static void main(String[] args){
        Garage g = new Garage("test", "Ergens 5", 1);
         Car n = new Car("hiyth", "Aixam", "Pearl white");
        // Car gu = new Car("hg505t", "Ford", "Zwart");
        System.out.println(n.getLisencePlate());
        //g.parkCar(n);
        // System.out.println(g.parkCar(gu));
        // System.out.println(g.countWhiteCars());
        // g.outOfGarage(gu);
        // System.out.println(g.cars.size());
       //System.out.println(g.validatePlate("xx-yy-xx"));
       System.out.println(g.parkCar(n));
 


        

    }

}
