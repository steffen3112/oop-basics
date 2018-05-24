package adapterPattern.Adaptee;

public class Mp4Player implements AdvancedMediaplayer {
    @Override
    public void playMp4() {
        System.out.println(this.getClass().getName() +  "playing mp4" );
    }

    @Override
    public void playVlc() {
        //System.out.println(this.getClass().getName() +  "playing VLC" );
    }
}
