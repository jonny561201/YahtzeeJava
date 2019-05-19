package Controllers;

import Factories.ScoringFactory;
import Repositories.RollsTable;
import models.ScoreResult;
import models.ScoringEnums;

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
        this.factory.create(scoreEnum);
        this.rollsTable.selectRollByPlayerGame(rollId);
        return null;
    }
}
