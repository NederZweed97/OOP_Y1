package week2.musicAlbum;

public class Main {
   
    public static void main(String[] args){
        Album a = new Album("Duuk", "I wan't your kibble");
        Song aa = new Song("aa", 205);
        Song bb = new Song("bb", 165);
        Song cc = new Song("Sub is the best", 180);
        Song dd = new Song("submarine", 196);
        a.addSong(aa);
        a.addSong(bb);
        a.addSong(cc);
        a.addSong(dd);
        // System.out.println(a.getAlbumLenght());
        // System.out.println(a.roadtripWorthy());
        // System.out.println(a.findThatSong("sub"));
        a.playSpecificSong(3);
        System.out.println(dd.getPlayCount());
        System.out.println(a.mostPLayed());

    }
    
}
