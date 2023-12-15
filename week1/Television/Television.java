package week1.Television;
import java.util.Scanner;

public class Television {
    private String brand;
    private String model;
    private int volume;
    private int channel;
    private int lock;
    private boolean lockActive = false;
    private static final Scanner SCAN = new Scanner(System.in);

    public Television(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getChannel(){
        return this.channel;
    }
    public void setChannel(int channel){
        this.channel = channel;
    }
    public int getLock(){
        return this.lock;
    }
 
    public boolean getLockActive(){
        return this.lockActive;
    }
    public void setLockActive(boolean active){
        this.lockActive = active;
    }
    public void setChildLock(int lock){
        if(!getLockActive()){
            this.lock = validateLockLenght(lock);
        } else{
            System.out.println("Hte kinderslot is actief");
            
        }
    }

    public int validateLockLenght(int lock){
        int validLenght = Integer.toString(Math.abs(lock)).length();
        if(validLenght != 4){
            System.out.println("het kinderslot moet 4 cijfers bevatten, het kinderlok is nu 1111. Je kan deze later wijzigen");
            setLockActive(true);
            return 1111;
        }
        setLockActive(true);
        return lock;
    }


    //Het onderstaande was mijn eerste versie, het was veels te ingewikkeld en werkte deels. 
    // //controleer of het ingevoerde slot uit 4 cijfers bestaat, zoniet dan wordt het 0000, anders wordt het de ingevoede slot.
    // public int validateLockLenght(int lock){
    //     int validLenght = Integer.toString(Math.abs(lock)).length();
    //     System.out.println(3);
    //     if(validLenght < 4 || validLenght > 4){
    //         System.out.println("Het slot moet uit 4 cijfers bestaan, het slot is nu 0000, deze kan je later wijzigen");
    //         setLockActive(true); // 0000 is in deze casus een geaccepteerde code dus is het kinderslot daarmee actief.
    //         return 1111;
    //     } 
    //     setLockActive(true);
    //     return lock;
    // }

    // public int CheckLockActive(){
    //     if(getLockActive()){
    //         System.out.println(1);
    //         int input = SCAN.nextInt();
    //         if(input == getLock()){
    //             System.out.println(2);
    //             return validateLockLenght((lock));
    //         } else{
    //             System.out.println("Vekeerde code, probeer opnieuw");
    //         }
    //     } 
    //     return validateLockLenght(lock);
    // }


    public static void main(String[] args){
        Television tel = new Television("samsung", "x60p");
        tel.setChildLock(555);


    }
}
