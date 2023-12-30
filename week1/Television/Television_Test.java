package week1.Television;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


public class Television_Test {
    private Television tv;
    
    @BeforeEach
    void setup(){
        this.tv = new Television("Samsung", "x602020");
    }

    @Test
    public void validVolumeInput(){
        String result = tv.ChangeVolume(98);
        assertEquals("Volume naar: 98", result);
    }
    @Test
    public void invalidVolumeInput(){
        String result = tv.ChangeVolume(-8);
        assertEquals("Ongeldige input", result);
    }
    @Test
    public void validChannelInput(){
        String result = tv.changeChannel(45);
        assertEquals("Naar zender: 45", result);
    }
    @Test
    public void invalidChannelInput(){
        String result = tv.changeChannel(88);
        assertEquals("Ongeldige zender", result);
    }
    @Test
    public void validFastChangeVolumeUp(){
        tv.setVolume(10);
        tv.fastChange("plus", "volume");
        assertEquals(tv.getVolume(), 11);
    }
    @Test
    public void invalidFastChangeVolumeUp(){
        tv.setVolume(100);
        String result = tv.fastChange("plus", "volume");
        assertEquals("Fout, probeer opnieuw", result);
    }
    @Test
    public void validFastChangeVolumeDown(){
        tv.setVolume(10);
        tv.fastChange("min", "volume");
        assertEquals(tv.getVolume(), 9);
    }
    @Test
    public void invalidFastChangeVolumeDown(){
        tv.setVolume(0);
        String result = tv.fastChange("min", "volume");
        assertEquals("Fout, probeer opnieuw", result);
    }
    @Test
    public void validFastChangeChannelUp(){
        tv.setChannel(12);
        tv.fastChange("plus", "channel");
        assertEquals(tv.getChannel(), 13);
    }
    @Test
    public void invalidFastChangeChannelUp(){
        tv.setChannel(75);
        String result = tv.fastChange("plus", "channel");
        assertEquals("Fout, probeer opnieuw", result);
    }


    
}
