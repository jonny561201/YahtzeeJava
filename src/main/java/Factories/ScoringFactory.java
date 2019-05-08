package Factories;

import ScoringServices.*;
import models.Scoring;
import models.ScoringEnums;

import static models.ScoringEnums.*;

public class ScoringFactory {

    public Scoring create(ScoringEnums scoring) {
        if (scoring.equals(FULL_HOUSE)) {
            return new FullHouse();
        }
        else if (scoring.equals(LARGE_STRAIGHT)) {
            return new LargeStraight();
        }
        else if (scoring.equals(SMALL_STRAIGHT)) {
            return new SmallStraight();
        }
        else if (scoring.equals(YAHTZEE)) {
            return new Yahtzee();
        }
        else if (scoring.equals(ONES)) {
            return new NumberScores(ONES.values);
        }
        else if (scoring.equals(TWOS)) {
            return new NumberScores(TWOS.values);
        }
        else if (scoring.equals(THREES)) {
            return new NumberScores(THREES.values);
        }
        else if (scoring.equals(FOURS)) {
            return new NumberScores(FOURS.values);
        }
        else if (scoring.equals(FIVES)) {
            return new NumberScores(FIVES.values);
        }
        else if (scoring.equals(SIXES)) {
            return new NumberScores(SIXES.values);
        }
        else if (scoring.equals(THREE_OF_A_KIND)) {
            return new ThreeOfAKind();
        }
        return null;
    }
}


