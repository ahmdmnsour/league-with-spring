package com.example.League.App;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
@Component
public class League {
    private String name;
    private Team homeTeam;
    private Team awayTeam;

    public String simulateMatch() {
        Random random = new Random();
        int homeTeamGoals = random.nextInt(10);
        int awayTeamGoals = random.nextInt(10);

        String output = homeTeam.getName() + " " + homeTeamGoals + " - " + awayTeamGoals + " " + awayTeam.getName() + "\n Scorers:\n";

        for (int i = 0; i < homeTeamGoals; i++) {
            Player scorer = random.nextBoolean() ? homeTeam.getStriker() : homeTeam.getDefender();
            output+= scorer.getName() + "\n";
        }
        for (int i = 0; i < awayTeamGoals; i++) {
            Player scorer = random.nextBoolean() ? awayTeam.getStriker() : awayTeam.getDefender();
            output+= scorer.getName() + "\n";
        }

        return output;
    }
}