package Task4;

public class BadAlbum extends Album {
    @Override
    public void addSong(Song song) {
        if(song.getName().length() == 3) {
            this.songs.add(song);
            int id = song.getId();
            int compare_id = song.getId();
            int new_id = 1;
            int remainder;

            while (id != 0) {
                remainder = id % 10;
                new_id = new_id * 10 + remainder;
                id = id / 10;
            }

            if (new_id == compare_id) {
                this.songs.add(song);
            }
        }
    }
}
