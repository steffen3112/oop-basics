package strategiePattern.context;

import strategiePattern.strategies.GenreManager;

public abstract class Musician {

    private GenreManager genreManager;


    public Musician(GenreManager genreManager){
        this.genreManager = genreManager;
    }

    public void setGenreManager(GenreManager genreManager) {
        this.genreManager = genreManager;
    }

    public void startDj(String track, String moves){
        genreManager.playTrack(track);
        genreManager.makeDanceMoves(moves);
    }

}
