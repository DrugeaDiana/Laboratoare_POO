package Task4;

public class DangerousAlbum extends Album{
    @Override
    public void addSong(Song song) {
        int number = song.getId();
        boolean flag = false;
        if(number % 2 == 0){
            flag = true;
        } else {
            for(int i = 3; i * i < number; i = i + 2) {
                if (number % i == 0) {
                    flag = true;
                    break;
                }
            }
        }

        if (!flag){
            this.songs.add(song);
        }
    }
}
