package week2.musicAlbum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
public class musicTest {
private Song songa;
private Song songb;
private Song songc;
private Album albuma;


    @BeforeEach
    public void setup(){
        this.songa = new Song("A", 210);
        this.songb = new Song("b", 180);
        this.songc = new Song("C", 225);
        this.albuma = new Album("AA", "ArtA");
        albuma.addSong(songa);
        albuma.addSong(songb);
        albuma.addSong(songc);
    }
    @Test
    public void amountOfSong(){
        int result = albuma.getTrackList().size();
        assertEquals(3,result);
    }
    @Test
    public void removeSong(){
        albuma.getTrackList().remove(0); //remove the first song
        int result = albuma.getTrackList().size();
        assertEquals(2, result);
    }
    @Test
    public void addSong(){
        albuma.addSong(songa);
        int result = albuma.getTrackList().size();
        assertEquals(4, result);
    }
    @Test
    public void getMostPlayed(){
        songa.setPlayCount(5);
        songb.setPlayCount(2);
        songc.setPlayCount(15);
        String result = albuma.mostPLayed();
        assertEquals("C", result);
    }





}
