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
        else if (scoring.equals(ScoringEnums.TWOS)) {
            return new NumberScores(2);
        }
        else if (scoring.equals(ScoringEnums.THREES)) {
            return new NumberScores(3);
        }
        else if (scoring.equals(ScoringEnums.FOURS)) {
            return new NumberScores(4);
        }
        else if (scoring.equals(ScoringEnums.FIVES)) {
            return new NumberScores(5);
        }
        return null;
    }
}


