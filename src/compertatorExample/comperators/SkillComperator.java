package compertatorExample.comperators;

import compertatorExample.domainObj.FootballPlayer;

import java.util.Comparator;

public class SkillComperator implements Comparator {

    private int skillPointsPlayer1;
    private int skillPointsPlayer2;

    @Override
    public int compare(Object o1, Object o2) {

        FootballPlayer player1 = (FootballPlayer) o1;
        FootballPlayer player2 = (FootballPlayer) o2;

        skillPointsPlayer1 = player1.getSkill().sumOfSkillPoints();
        skillPointsPlayer2 = player2.getSkill().sumOfSkillPoints();

        if(skillPointsPlayer1 < skillPointsPlayer2) return 1;
        if(skillPointsPlayer1 > skillPointsPlayer2) return -1;
        return 0;

    }
}
