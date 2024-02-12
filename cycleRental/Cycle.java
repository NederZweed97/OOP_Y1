package cycleRental;

public class Cycle {


    private int ID;
    private double kilometersMade;
    private boolean available;

    public Cycle(int id, double kilometersMade, boolean available) {
        ID = id;
        this.kilometersMade = kilometersMade;
        this.available = available;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public double getKilometersMade() {
        return kilometersMade;
    }
    public void setKilometersMade(double kilometersMade) {
        this.kilometersMade = kilometersMade;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
