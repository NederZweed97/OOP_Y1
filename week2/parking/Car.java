package week2.parking;

public class Car {
    private String lisencePlate;
    private String brand;
    private String color;

    public Car(String lp, String brand, String color){
        this.lisencePlate = setLicensePlate(lp);
        this.brand = brand;
        this.color = color;
    }

    public String getLisencePlate() {
        return lisencePlate;
    }
    public String setLicensePlate(String licensePlate) {
        if(licensePlate.length() == 6){
        String temp = licensePlate.replaceAll("(.{2})", "$1-");
        temp = temp.replaceAll("-$", "");
        return temp;
        }
        return "xx-xx-xx";
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

public static void main(String[] args){
 
}

    
}
