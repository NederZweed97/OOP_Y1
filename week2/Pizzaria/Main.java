package week2.Pizzaria;

public class Main {
    private static Pizzeria p = new Pizzeria("mamma mia");
    private static Courier c = new Courier("test", 21);
    private static  Route r = new Route(c);
    private static Order oa = new Order("a", "testaddr 1", 2, 10);
    private static Order ob = new Order("ob", "testAddr b", 1, 5);


    public static void main(String[] args){
      r.addDestination(oa);
      r.addDestination(ob);
      p.addRoute(r);

      System.out.println(p.getTotalProfit());
      System.out.println(p.getRouteWithMostPizzas());


    }


}
