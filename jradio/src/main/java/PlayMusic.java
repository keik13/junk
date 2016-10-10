import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * Simple internet radio ^_^
 *
 * @author Andrey Koba)
 */

public class PlayMusic {
    public static void main(String[] args) {
        String urlString = "http://www.europaplus.ru/sound/1429261730_Kadebostany__Castle_In_The_Snow_remix.mp3";
        try {
            URL url = new URL(urlString);
            InputStream fin = url.openStream();
            InputStream is = new BufferedInputStream(fin);

            Player player;
            player = new Player(is);
            player.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
