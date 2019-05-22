package com.Factories;

import com.ScoringServices.*;
import com.models.Scoring;
import com.models.ScoringEnums;

import static com.models.ScoringEnums.*;

public class ScoringFactory {

    public Scoring create(ScoringEnums scoring) {
        switch (scoring) {
            case FULL_HOUSE:
                return new FullHouse();
            case LARGE_STRAIGHT:
                return new LargeStraight();
            case SMALL_STRAIGHT:
                return new SmallStraight();
            case YAHTZEE:
                return new Yahtzee();
            case ONES:
                return new NumberScores(ONES);
            case TWOS:
                return new NumberScores(TWOS);
            case THREES:
                return new NumberScores(THREES);
            case FOURS:
                return new NumberScores(FOURS);
            case FIVES:
                return new NumberScores(FIVES);
            case SIXES:
                return new NumberScores(SIXES);
            case THREE_OF_A_KIND:
                return new OfAKind(THREE_OF_A_KIND);
            case FOUR_OF_A_KIND:
                return new OfAKind(FOUR_OF_A_KIND);
            default:
                return null;
        }
    }
}


