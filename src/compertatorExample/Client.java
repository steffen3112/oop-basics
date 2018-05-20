package compertatorExample;

import compertatorExample.comperators.AgeComperator;
import compertatorExample.comperators.SkillComperator;
import compertatorExample.domainObj.FootballPlayer;
import compertatorExample.domainObj.Skill;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args){

        //Setup
        Skill ronaldoSkill = new Skill(80, 90, 95);
        Skill riberySkill = new Skill(75, 85, 94);
        Skill robbenSkill = new Skill(80, 80, 96);

        FootballPlayer ronaldo = new FootballPlayer(ronaldoSkill, 28, "Ronaldo");
        FootballPlayer ribery = new FootballPlayer(riberySkill, 34, "Ribery");
        FootballPlayer robben = new FootballPlayer(robbenSkill, 37, "Robben");

        List<FootballPlayer> playerList = new LinkedList<>();
        playerList.add(ronaldo);
        playerList.add(ribery);
        playerList.add(robben);

        AgeComperator ageComperator = new AgeComperator();
        SkillComperator skillComperator = new SkillComperator();

        //Comparing
        int i = 0;
        playerList.sort(ageComperator);
        for(FootballPlayer player : playerList){
            i++;
            System.out.println( i + ". " +player.toString());
        }

        i=0;
        playerList.sort(skillComperator);
        for(FootballPlayer player : playerList){
            i++;
            System.out.println( i + ". " +player.toString());
        }


    }
}
