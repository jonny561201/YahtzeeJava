package Factories;

import ScoringServices.*;
import models.Scoring;
import models.ScoringEnums;

public class ScoringFactory {

    public Scoring create(ScoringEnums scoring) {
        if (scoring.equals(ScoringEnums.FULL_HOUSE)) {
            return new FullHouse();
        }
        else if (scoring.equals(ScoringEnums.LARGE_STRAIGHT)) {
            return new LargeStraight();
        }
        else if (scoring.equals(ScoringEnums.SMALL_STRAIGHT)) {
            return new SmallStraight();
        }
        else if (scoring.equals(ScoringEnums.YAHTZEE)) {
            return new Yahtzee();
        }
        else if (scoring.equals(ScoringEnums.ONES)) {
            return new NumberScores(1);
        }
        return null;
    }
}


