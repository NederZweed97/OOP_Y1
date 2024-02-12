package Pizzaria;

public class Order {
    private String name;
    private String address;
    private int numPizzas;
    private int distanceFromlast;


    public Order(String name, String address, int numPizzas, int distanceFromlast){
        this.name = name;
        this.address = address;
        this.numPizzas = numPizzas;
        this.distanceFromlast = distanceFromlast;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getNumPizzas(){
        return this.numPizzas;
    }
    public void setNumPizzas(int numPizzas){
        this.numPizzas = numPizzas;
    }
    public int getDistanceFromlast(){
        return this.distanceFromlast;
    }
    public void setDistanceFromlast(int distanceFromlast){
        this.distanceFromlast = distanceFromlast;
    }

    public int getPrice(){
        return this.getNumPizzas() * 5;
    }

}
