package week1.Television;

public class Television {
    private String brand;
    private String model;
    private int volume;
    private int channel;
    private Integer lock;
    private boolean lockActive = false;
   

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
    public Integer getLock(){
        return this.lock;
    }
    public void setLock(Integer lock){
        this.lock = lock;
    }
 
    public boolean getLockActive(){
        return this.lockActive;
    }
    public void setLockActive(boolean active){
        this.lockActive = active;
    }

    public String changeChannel(int channelNumber){
        if(channelNumber < 1 || channelNumber > 75){
            return "Ongeldige zender";
        }
        setChannel(channelNumber);
        return "Naar zender: " + channelNumber;
    }
    public String ChangeVolume(int volume){
        if(volume < 0 || volume > 100){
            return "Ongeldige input";
        }
        setVolume(volume);
        return "Volume naar: " + volume;
    }
    public String fastChange(String direction, String type) {
        if ("volume".equals(type)) {
            if ("plus".equals(direction) && getVolume() < 100) {
                this.volume++;
            } else if ("min".equals(direction) && getVolume() > 0) {
                this.volume--;
            } else {
                return "Fout, probeer opnieuw";
            }
    
        } else if ("channel".equals(type)) {
            if ("plus".equals(direction) && getChannel() < 75) {
                this.channel++;
            } else if ("min".equals(direction) && getChannel() > 1) {
                this.channel--;
            } else {
                return "Fout, probeer opnieuw";
            }
        }
        return "Volume: " + getVolume() + "\nZender: " + getChannel();
    }
    public String changeLock(int oldLock, int newLock){
        if(getLockActive()){
            if(getLock() == oldLock){
                setLock(newLock);
                return "Kinderslot succesvol veranderd";
            } else{
                return "Verkeerde code probeer opnieuw";
            }           
        } else{
            return "er is geen slot, maak er een aan";
        }  
    }

    public String RemoveLock(int lock){
        if(getLockActive()){
            if(getLock() == lock){
                setLock(null);
                setLockActive(false);
                return "Slot succesvol verwijderd";
            } else{
                return "Verkeerde code, probeer opnieuw";
            }
        } else{
            return "Geen slot gevonden";
        }
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
            System.out.println("het kinderslot moet 4 cijfers bevatten, het kinderslot is nu 1111. Je kan deze later wijzigen");
            setLockActive(true);
            return 1111;
        }
        setLockActive(true);
        return lock;
    }

    





    public static void main(String[] args){
        Television tel = new Television("samsung", "x60p");
        tel.setChildLock(5555);
        System.out.println(tel.RemoveLock(5555));

        System.out.println(tel.ChangeVolume(105));
        System.out.println(tel.getVolume()); // null;
        System.out.println(tel.ChangeVolume(55));
        System.out.println(tel.getVolume()); //55
    }
}
