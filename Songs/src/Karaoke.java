/**
 * Created by kayla.flynn on 7/7/2017.
 */

import com.teamtreehouse.KaraokeMachine;
import com.teamtreehouse.model.Song;
import com.teamtreehouse.model.SongBook;

public class Karaoke {
    public static void main(String[] args){
        // Can remove these lines because we have a Karaoke Machine!
/*        Song song = new Song (
                "Michael Jackson",
                "Beat It",
                "https://www.youtube.com/watch?v=oRdxUFDoQe0"
        );*/

        SongBook songBook = new SongBook();
        songBook.importFrom("songs.txt");
        // added here
        KaraokeMachine machine = new KaraokeMachine(songBook);
        machine.run();
        System.out.println("Saving book ");
        songBook.exportTo("songs.txt");

/*        System.out.printf("Adding %s %n", song);
        songBook.addSong(song);
        System.out.printf("There are %d songs. %n", songBook.getSongCount());*/
    }
}
