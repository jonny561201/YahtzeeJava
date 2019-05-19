package Controllers;

import Factories.ScoringFactory;
import Repositories.RollsTable;
import models.Die;
import models.ScoreResult;
import models.Scoring;
import models.ScoringEnums;

import java.util.List;
import java.util.UUID;

public class ScoreController {

    private final ScoringFactory factory;
    private final RollsTable rollsTable;

    public ScoreController(ScoringFactory factory, RollsTable rollsTable) {
        this.factory = factory;
        this.rollsTable = rollsTable;
    }

    public ScoreResult score(String scoreType, UUID rollId) {
        ScoringEnums scoreEnum = ScoringEnums.parse(scoreType);
        Scoring scoring = this.factory.create(scoreEnum);
        List<Die> roll = this.rollsTable.selectRollByPlayerGame(rollId);

        Integer score = scoring.calculateScore(roll);

        return new ScoreResult(score);
    }
}
