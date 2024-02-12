package Pizzaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class PizzariaTest {
    private Route route;
    private Courier courier;
    private Order orderA;
    private Order orderB;
    private Order orderC;
    private Order orderD;

    @BeforeEach
    void setup(){
        this.courier = new Courier("Jaap", 14, 9, 1997);
        this.route = new Route(courier);
        this.orderA = new Order("A", "addr A", 2, 5);
        this.orderB = new Order("B", "addr B", 1, 2);
        this.orderC = new Order("C", "addr c", 1, 15);
        this.orderD = new Order("D", "addr D", 6, 2);
        route.addDestination(orderA);
        route.addDestination(orderB);
        route.addDestination(orderC);
        route.addDestination(orderD);
        Pizzeria pizzeria = new Pizzeria("Mamma mia");
        pizzeria.addRoute(route);
    }

    @Test
    public void pizzaPrice(){
        int result = orderA.getPrice();
        assertEquals(10, result);
    }
    @Test
    public void correctCourierAge(){
        int result = courier.getAge();
        assertEquals(26, result);
    }
    @Test
    public void correctCourierSalary(){
        double result = courier.getSalary();
        assertEquals(5.25, result);
    }
    @Test
    public void calculateTotalDistance(){
       int result = route.totalDistance();
       assertEquals(24, result);
    }

    @Test
    public void calculateProfitFromRoute(){
        double result = route.profitFromRoute();
        assertEquals(43.55, result);
    }
    @Test
    public void pizzarevenue(){
        int result = route.totalPizzaRevenue();
        assertEquals(50, result);
    }
}
