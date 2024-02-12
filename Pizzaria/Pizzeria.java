package Pizzaria;
import java.util.ArrayList;
import java.util.List;
public class Pizzeria {
    private List<Route> routes = new ArrayList<>();
    private String name;

    public Pizzeria(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void addRoute(Route r){
        routes.add(r);
    }
    public Route getLongestRoute(){
        Route temp = routes.get(0);
        for(Route r : routes){
            if(temp.totalDistance() < r.totalDistance()){
                temp = r;
            }
        }
        return temp;
    }
    public Route getShortestRoute(){
        Route temp = routes.get(0);
        for(Route r : routes){
            if(temp.totalDistance() > r.totalDistance()){
                temp = r;
            }
        }
        return temp;
    }
  public Route getRouteWithMostPizzas(){
        Route temp = routes.get(0);
        for(Route r : routes){
            if(temp.totalPizzaRevenue() < r.totalPizzaRevenue()){ //alle pizzas zijn 5 eur. dus het hoogste nummer heeft de meeste pizzas.
                temp = r;
            }
        }
        return temp;
  }

  public double getTotalProfit(){
        double total = 0;
        for(Route r : routes){
            total += r.profitFromRoute();
        }
        return total;
  }
}
