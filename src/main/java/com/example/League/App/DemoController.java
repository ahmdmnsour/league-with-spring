package com.example.League.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private League league;

    @Autowired
    public DemoController(League league , Team home, Team away,
                          @Qualifier("striker") Player strikerH,
                          @Qualifier("defender") Player defH,
                          @Qualifier("goalkeeper") Player gkH,
                          @Qualifier("striker") Player strikerA,
                          @Qualifier("defender") Player defA,
                          @Qualifier("goalkeeper") Player gkA) {
        strikerH.setName("mo salah");
        strikerH.setShirtNumber(10);
        defH.setName("abc");
        defH.setShirtNumber(1);
        gkH.setName("aqwe");
        gkH.setShirtNumber(12);
        strikerH.setName("haland");
        strikerH.setShirtNumber(3);
        defH.setName("qqq");
        defH.setShirtNumber(9);
        gkH.setName("tyuh");
        gkH.setShirtNumber(7);
        home.setName("Liverpool");
        away.setName("Man city");
        home.setStriker(strikerH);
        home.setDefender(defH);
        home.setGoalkeeper(gkH);
        away.setStriker(strikerA);
        away.setDefender(defA);
        away.setGoalkeeper(gkA);

        league.setHomeTeam(home);
        league.setAwayTeam(away);

        this.league = league;
    }

    @GetMapping("/match")
    public String getMatch() {
        return league.simulateMatch();
    }
}
