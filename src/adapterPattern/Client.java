package adapterPattern;

import adapterPattern.Adaptee.AdvancedMediaplayer;
import adapterPattern.Adaptee.Mp4Player;
import adapterPattern.domainObj.MediaPlayer;
import adapterPattern.domainObj.SimpleMediaPlayer;

public class Client {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new SimpleMediaPlayer();
        mediaPlayer.play();

        MediaPlayer mediaPlayer1 = new MediaPlayerAdapter(new Mp4Player());
        mediaPlayer1.play();




    }
}
