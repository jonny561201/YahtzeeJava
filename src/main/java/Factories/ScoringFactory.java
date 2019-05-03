package Factories;

import ScoringServices.FullHouse;
import models.Scoring;
import models.ScoringEnums;

public class ScoringFactory {

    public Scoring create(ScoringEnums scoring) {
        return new FullHouse();
    }
}
