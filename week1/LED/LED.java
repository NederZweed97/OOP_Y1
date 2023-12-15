package week1.LED;
import java.util.Scanner;

public class LED {
    private double dim;
    private int r;
    private int g;
    private int b;
    private String color;
    private static final Scanner SCAN = new Scanner(System.in); // de scanner is static (en een constant) omdat het maken van meerdere scanners niet nodig is. Hiervoor stond het in een try ctach maar die stopte de InpuStream en daarmee crashte setDimValue(). 

    public LED(){}

    public String getRGB(){
        return this.r + " " + this.g + " " + this.b;
    }
    public void setRGB(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public double getDim(){
        return this.dim;
    }
    public void setDim(double dim){
        this.dim = dim;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }


    public String getColorValue(){
            System.out.println("Geef de naam op (hoofletter gevoelig) of de rgb waardes met spaties bijv 255 0 0");
            String name = SCAN.nextLine().trim(); //trim zorgt ervoor dat spaties voor en na de daadwerkelijke string weggelaten wordt.
            return name;
    }

// Wanneer je de functie oproept, wordt getColorValue() ook geroepen, hiermee minimaliseer je de acties voor de eindgebruiker. zet de return waarde van getColorValue() in een string en beslis met een if-else statment wat er moet gebeuren.
// Wanneer een kleur gevonden kan worden, wordt status op true gezet en geretourneerd zoals verwacht in de opdracht.
    public boolean setLED(){
        String rgb = getColorValue();
        boolean status = false;
        if("Rood".equals(rgb) || "255 0 0".equals(rgb)){
            setRGB(255, 0, 0);
            setColor("Rood");
            status = true;
        } else if("Blauw".equals(rgb) || "0 0 255".equals(rgb)){
            setRGB(0, 0, 255);
            setColor("Blauw");
            status = true;
        } else if("Groen".equals(rgb) || "0 255 0".equals(rgb)){
            setRGB(0,255,0);
            setColor("Green");
            status = true;
        } else if("Paars".equals(rgb) || "255 0 255".equals(rgb)){
            setRGB(255, 0,255);
            setColor("Paars");
            status = true;
        }else if("Oranje".equals(rgb) || "255 165 0".equals(rgb)){
            setRGB(255, 165, 0);
            setColor("Oranje");
            status = true;
        } else if("Zon".equals(rgb) || "201 141 38".equals(rgb)){
            setRGB(201, 141, 38);
            setColor("Zon");
            status = true;
        }
        else{
            System.out.println(rgb + " niet gevonden, controlleer en probeer opnieuw");
            setRGB(0, 0, 0);
            setColor("-");
        }
        return status;   
    }
    
    public void setDimValue(){
            System.out.println("Zet de dimmer. o% (geen dim) tot 100%(volledige dim)");
            int input = SCAN.nextInt();
            double dimValue = 255 * ((double) input / 100);
            dimValue = Math.round(dimValue * 2) / 2.0; // rond het af naar het het dichtsbijzijnde 0.5
            setDim(dimValue);
    } 
      

    public static void main(String[] args){
        LED strip = new LED();
        System.out.println(strip.setLED());
        strip.setDimValue();
    }
}




