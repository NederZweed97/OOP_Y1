package week1.Book;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class BookTest
{
    private Book boek;

    @BeforeEach
    void setup(){
        this.boek = new Book("Oiit", "een schrijver", true, 9.95, 320);
    }

    @Test
    void UpreadCounterTest(){
        //Act
        boek.upReadCount();
        //Assert
        assertEquals(1, boek.getReadCount());
    }
    @Test
    void ReadingLimitTest(){
        assertEquals("Dit kun je beter niet meer gaan lezen", boek.getReadingAdvice());
    }

}