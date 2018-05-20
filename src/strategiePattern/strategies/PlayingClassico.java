package strategiePattern.strategies;

public class PlayingClassico implements GenreManager{

    @Override
    public void playTrack(String track) {
        System.out.println("Playing " + track + " on piano");
    }

    @Override
    public void makeDanceMoves(String moves) {
        System.out.println("I wont move");
    }
}
