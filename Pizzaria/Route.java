package week2.Pizzaria;
import week1.LED.LEDTest;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private List<Order> orders = new ArrayList<>();
    private Courier courier;

    public Route( Courier c){
        this.courier = c;
    }

    public List<Order> getOrders(){
        return this.orders;
    }
    public void setOrders(List<Order> order){
        this.orders = order;
    }

    public void addDestination(Order o){
        orders.add(o);
    }

    public int totalDistance(){
        int total = 0;
        for(Order o : orders){
            total += o.getDistanceFromlast();
        }
        return total;
    }

    public double costTotalRoute(){
        return totalDistance() * 0.05;
    }

    public int totalPizzaRevenue(){
        int total = 0;
        for(Order o : orders){
            total += o.getPrice();
        }
        return total;
    }
    public double profitFromRoute(){
        double p = 0;
        p += (totalPizzaRevenue() - costTotalRoute()) - courier.getSalary();
        return Math.floor(p * 100)/100; //returns the profit with 2 decimals.
    }



    
}
