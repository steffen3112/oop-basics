package strategiePattern.strategies;

public class PlayingMetal implements GenreManager {
    @Override
    public void playTrack(String track) {
        System.out.println("HEAVY METAL: " + track);
    }

    @Override
    public void makeDanceMoves(String moves) {
        System.out.println("Moves: " + moves);

    }
}
