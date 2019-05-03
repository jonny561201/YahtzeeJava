package Factories;

import ScoringServices.FullHouse;
import ScoringServices.LargeStraight;
import models.Scoring;
import models.ScoringEnums;

public class ScoringFactory {

    public Scoring create(ScoringEnums scoring) {
        if (scoring.equals(ScoringEnums.FULL_HOUSE)) {
            return new FullHouse();
        }
        if (scoring.equals(ScoringEnums.LARGE_STRAIGHT)) {
            return new LargeStraight();
        }
        return null;
    }
}
