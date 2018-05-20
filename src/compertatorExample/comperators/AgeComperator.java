package compertatorExample.comperators;

import compertatorExample.domainObj.FootballPlayer;

import java.util.Comparator;

public class AgeComperator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        FootballPlayer player1 = (FootballPlayer) o1;
        FootballPlayer player2 = (FootballPlayer) o2;

        if(player1.getAge() < player2.getAge()) return 1;
        if(player1.getAge() > player2.getAge()) return -1;
        return 0;
    }
}
