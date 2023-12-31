package week2.musicAlbum;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private String artist;
    private String coverTitle;
    private List<Song> trackList = new ArrayList<>();

    public Album(String artist, String coverT){
        this.artist = artist;
        this.coverTitle = coverT;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getCoverTitle() {
        return coverTitle;
    }
    public void setCoverTitle(String coverTitle) {
        this.coverTitle = coverTitle;
    }
    public List<Song> getTrackList() {
        return trackList;
    }
    public void addSong(Song song){
        this.trackList.add(song);
    }

    public void playSpecificSong(int index){
        trackList.get(index).playSong();
    }

    public String mostPLayed(){
        Song most = trackList.get(0);

        for(Song s : trackList){
            if(s.getPlayCount() > most.getPlayCount()){
                most = s;
            }
        }
        return most.getTitle();
    }

    public int getAlbumLenght(){
        int lenght = 0;
        for(Song s : trackList){
            lenght += s.getLenght();
        }
        return lenght;
    }
    public String roadtripWorthy(){
        int t = getAlbumLenght() / 60;
        if(t > 60){
            return "Put it on a USB stick, we're going on a roadtrip!";
        }
        return "he jammer, niet lang genoeg";
    }

    public List<String> findThatSong(String word){
        List<String> matching = new ArrayList<>();
        for(Song s : trackList){
            if(s.getTitle().toLowerCase().contains(word.toLowerCase())){
                matching.add(s.getTitle());
            }
        }
        return matching;
    }






    
}
