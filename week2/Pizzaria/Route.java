package week2.Pizzaria;
import java.util.ArrayList;
import java.util.List;

public class Route {
    private List<Destination> destinations = new ArrayList<>();

    public Route(){}

    public void addDestination(Destination d){
        destinations.add(d);
    }

    
}
