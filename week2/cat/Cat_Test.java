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
    public void adopCat(){
        Saar.adoptCat(duuk);
        Boolean result = Saar.getCat() != null;
        assertEquals(true, result);
    }
}