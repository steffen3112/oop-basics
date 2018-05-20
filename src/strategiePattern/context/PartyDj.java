package strategiePattern.context;

import strategiePattern.strategies.GenreManager;

public class PartyDj extends Musician {

    public PartyDj(GenreManager genreManager) {
        super(genreManager);
    }

    public void playHardAndLoud(){
        this.startDj("EXTREME TERROR ", "Ultra Headbanging");
    }



}
