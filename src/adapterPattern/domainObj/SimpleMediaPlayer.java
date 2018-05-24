package adapterPattern.domainObj;

public class SimpleMediaPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Playing simple mp3");
    }
}
