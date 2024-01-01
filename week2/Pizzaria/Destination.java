package week2.Pizzaria;

public class Destination {
    private String name;
    private String adress;
    private Double distance;
    private int pizzas;
    private double deliveryFee;
    private double costs;

    public Destination(String name, String adress, Double distance, int pizzas) {
        this.name = name;
        this.adress = adress;
        this.distance = distance;
        this.pizzas = pizzas;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public Double getDistance() {
        return distance;
    }
    public void setDistance(Double distance) {
        this.distance = distance;
    }
    public int getPizzas() {
        return pizzas;
    }
    public void setPizzas(int pizzas) {
        this.pizzas = pizzas;
    }
    public double getDeliveryFee() {
        return deliveryFee;
    }
    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
    public double getCosts() {
        return costs;
    }
    public void setCosts(double costs) {
        this.costs = costs;
    }



}
