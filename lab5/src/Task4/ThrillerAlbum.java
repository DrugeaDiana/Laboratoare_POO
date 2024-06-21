package Task4;

public class ThrillerAlbum extends Album{
    @Override
    public void addSong(Song song) {
        if(song.getComposer().equals("Michael Jackson")) {
            if(song.getId() % 2 == 0) {
                this.songs.add(song);
            }
        }
    }
}
