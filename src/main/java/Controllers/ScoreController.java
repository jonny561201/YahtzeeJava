package Controllers;

import Factories.ScoringFactory;
import models.ScoreResult;
import models.ScoringEnums;

public class ScoreController {

    private final ScoringFactory factory;

    public ScoreController(ScoringFactory factory) {
        this.factory = factory;
    }

    public ScoreResult score(String scoreType) {
        this.factory.create(ScoringEnums.FULL_HOUSE);
        return null;
    }
}
