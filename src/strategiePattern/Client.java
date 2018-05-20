package strategiePattern;

import strategiePattern.context.Musician;
import strategiePattern.context.PartyDj;
import strategiePattern.strategies.PlayingClassico;
import strategiePattern.strategies.PlayingMetal;
import strategiePattern.strategies.PlayingTechno;

public class Client {

    public static void main(String[] args){

        //Setup Context with strategy
        Musician myDj = new PartyDj(new PlayingMetal());
        myDj.startDj("Blister Exists", "Headbanging");

        //Change Context
        myDj.setGenreManager(new PlayingTechno());
        myDj.startDj("Fresh Cream", "Shuffle");

        //Change Context
        myDj.setGenreManager(new PlayingClassico());
        myDj.startDj("Kleine Nachtmusik", "Shuffle");

        PartyDj myNewDj = new PartyDj(new PlayingClassico());
        myNewDj.playHardAndLoud();
    }



}
