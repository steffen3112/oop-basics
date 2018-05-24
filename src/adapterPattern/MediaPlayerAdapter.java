package adapterPattern;

import adapterPattern.Adaptee.AdvancedMediaplayer;
import adapterPattern.Adaptee.Mp4Player;
import adapterPattern.domainObj.MediaPlayer;

public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaplayer advancedMediaplayer;

    public MediaPlayerAdapter(AdvancedMediaplayer advancedMediaplayer) {
        this.advancedMediaplayer = advancedMediaplayer;
    }

    public void setAdvancedMediaplayer(AdvancedMediaplayer advancedMediaplayer) {
        this.advancedMediaplayer = advancedMediaplayer;
    }

    @Override
    public void play() {
        if(advancedMediaplayer instanceof Mp4Player) {
            advancedMediaplayer.playMp4();
        } else {
            advancedMediaplayer.playVlc();
        }
    }
}
