package week2.cat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class Cat_Test {
    private Cat duuk;
    private Owner Saar;

    @BeforeEach
    void setup(){
        this.duuk = new Cat("Duuk", 3.7);
        this.Saar = new Owner();
    }
    @Test
    public void adoptCat(){
        Saar.adoptCat(duuk);
        Boolean result = Saar.getCat() != null;
        assertEquals(true, result);
    }
    @Test
    public void callCat(){
        Saar.adoptCat(duuk);
        String result = Saar.callCat();
        assertEquals("Kom eens hier, Duuk", result);
    }
    @Test
    public void petCat(){
        Saar.adoptCat(duuk);
        Saar.petCat();
        Double result = this.duuk.getHappinessLevel();
        assertEquals(4.0, result);
    }
}