package week1.Photo;
import java.util.ArrayList;
import java.util.List;

public class Photo {
    private int height;
    private int width;
    private List<String> people = new ArrayList<>();
    private String description;
    private int dpi;

    public Photo(int height, int width, String description, double diagonalCm){
        this.height = height;
        this.width = width;
        this.description = description;
        this.dpi = setDPI(diagonalCm);
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public List<String> getPeople() {
        return people;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getDpi() {
        return dpi;
    }
    public int setDPI(double diagonal){
        return (int) Math.round(Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2)) / (diagonal / 2.54));
    }
    public String isPrintable(){
        if(getHeight() >= 585 && getWidth() >= 878 && getDpi() >= 150){
            return "printbaar";
        }
        return "niet printbaar";
    }
    public void addPeople(String name){
        this.people.add(name);
    }

   public void getNamesOnList(){
    for(String name : this.people){
        System.out.println(name);
    }
   }

    public String isGroupPhoto(){
        if(this.people.size() >= 2){
            return "Ja, dit is een groepsfoto";
        }
        return "Nee, dit is geen groepsfoto";
    }

   
    public static void main(String[] args){
    Photo test = new Photo(585, 878, "Een test", 18);
    System.out.println(test.getDpi());
    test.addPeople("Sarah");
    test.addPeople("Duuk");
    test.addPeople("kleine");
    test.getNamesOnList();
    System.out.println(test.isGroupPhoto());
    System.out.println(test.isPrintable());
    }
    

}
