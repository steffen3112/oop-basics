package strategiePattern.strategies;

public class PlayingTechno implements GenreManager {

    @Override
    public void playTrack(String track) {
        System.out.println("Playing hard Techno " + track);
    }

    @Override
    public void makeDanceMoves(String moves) {
        System.out.println("Making moves " + moves);

    }

}
