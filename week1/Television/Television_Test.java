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
        assertEquals(result, "Volume naar: 98");
    }
    @Test
    public void invalidVolumeInput(){
        String result = tv.ChangeVolume(-8);
        assertEquals(result, "Ongeldige input");
    }
    @Test
    public void validChannelInput(){
        String result = tv.changeChannel(45);
        assertEquals(result, "Naar zender: 45");
    }
    @Test
    public void invalidChannelInput(){
        String result = tv.changeChannel(88);
        assertEquals(result, "Ongeldige zender");
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
        assertEquals(result, "Fout, probeer opnieuw");
    }
    @Test
    public void validFastChangeVolumeDown(){
        tv.setVolume(10);
        tv.fastChange("min", "volume");
        assertEquals(9, tv.getVolume());
    }
    @Test
    public void invalidFastChangeVolumeDown(){
        tv.setVolume(0);
        String result = tv.fastChange("min", "volume");
        assertEquals(result, "Fout, probeer opnieuw");
    }
    @Test
    public void validFastChangeChannelUp(){
        tv.setChannel(12);
        tv.fastChange("plus", "channel");
        assertEquals(13, tv.getChannel());
    }
    @Test
    public void invalidFastChangeChannelUp(){
        tv.setChannel(75);
        String result = tv.fastChange("plus", "channel");
        assertEquals(result, "Fout, probeer opnieuw");
    }
    @Test
    public void validFastChangeChannelDown(){
        tv.setChannel(12);
        tv.fastChange("min", "channel");
        assertEquals(11, tv.getChannel());
    }
    @Test
    public void invalidFastChangeChannelDown(){
        tv.setChannel(0);
        String result = tv.fastChange("min", "channel");
        assertEquals(result, "Fout, probeer opnieuw");
    }
    @Test
    public void setValidChildlLock(){
        tv.setChildLock(2222);
        int result = tv.getLock();
        assertEquals(result, 2222);
        assertEquals(true, tv.getLockActive());
    }
    @Test
    public void setInvalidChildLock(){
        tv.RemoveLock(2222);
        tv.setChildLock(555);
        assertEquals(1111, tv.getLock());
        assertEquals(true, tv.getLockActive());
    }
    @Test
    public void removeChildLock(){
        tv.RemoveLock(1111);
        boolean result = tv.getLockActive();
        assertEquals(false, result);
        assertEquals(null, tv.getLock());
    }
    @Test
    public void lockAlreadyActive(){
        tv.setChildLock(5555);
        String result = tv.setChildLock(2222);
        assertEquals("Het kinderslot is actief", result);
    }
    @Test
    public void correctLockChange(){
        tv.setChildLock(2222);
        String result = tv.changeLock(2222, 5555);
        assertEquals("Kinderslot succesvol veranderd", result);
    }
    @Test 
    public void changeLockWithIncorrectLock(){
        tv.setChildLock(5555);
        String result = tv.changeLock(2222, 5555);
        assertEquals("Verkeerde code probeer opnieuw", result);
    }
    @Test
    public void tryChangeWithoutLockActive(){
        String result = tv.changeLock(5555, 2222);
        assertEquals("er is geen slot, maak er een aan", result);
    }    
}