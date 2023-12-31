package week1.Photo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class Photo_Test {
    private Photo foto;
    @BeforeEach
    void setup(){
        this.foto = new Photo(590, 680, "een oude foto uit het wilde westen", 7.5);
    }
    /*Okej, ik weet serieus niet war voor test cases ik verder rmoet maken*/
    @Test
    public void getDPIValue(){
        int result = foto.calculateDPI(18);
        assertEquals(127, result);
    }
    @Test
    public void cannotPrint(){
        String result = foto.canPrint();
        assertEquals("niet printbaar", result);
    }
    @Test
    public void canPrint(){
        foto.setHeight(585);
        foto.setWidth(878);
        foto.setDpi(foto.calculateDPI(17));
        String result = foto.canPrint();
        assertEquals("printbaar", result);
    }
    @Test
    public void isGroupPhoto(){
        foto.addPeople("Miron");
        foto.addPeople("Jonathan");
        foto.addPeople("axel");
        foto.isGroupPhoto();
        assertEquals("Ja, dit is een groepsfoto", "Ja, dit is een groepsfoto");
    }
    @Test
    public void notAGroupPhoto(){
        foto.addPeople("myself");
        foto.isGroupPhoto();
        assertEquals("Nee, dit is geen groepsfoto", "Nee, dit is geen groepsfoto");
    }



}
