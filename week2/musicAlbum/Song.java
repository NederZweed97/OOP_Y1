package week2.musicAlbum;

public class Song {
    private String title;
    private int lenght;
    private int playCount = 0;

    public Song(String title, int lenght){
        this.title = title;
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLenght() {
        return lenght;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public int getPlayCount() {
        return playCount;
    }
    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }
    public void playSong(){
        this.playCount++;
    }


    
}
