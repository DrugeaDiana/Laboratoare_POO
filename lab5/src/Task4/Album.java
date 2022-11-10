package Task4;

import java.util.ArrayList;

public abstract class Album {
    ArrayList<Song> songs = new ArrayList<>();

    public abstract void addSong(Song song);

    public void removeSong(Song song){
        int max = songs.size();
        int id = 0;
        for(int i = 0; i < max; i++) {
            if(songs.get(i).getName().equals(song.getName())) {
               id = i;
            }
        }
        songs.remove(id);
    }

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songs +
                '}';
    }
}
