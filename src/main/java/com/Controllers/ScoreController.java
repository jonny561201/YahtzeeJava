package com.Controllers;

import com.Factories.ScoringFactory;
import com.Repositories.RollsTable;
import com.models.Die;
import com.models.ScoreResult;
import com.models.Scoring;
import com.models.ScoringEnums;

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
        List<Die> roll = this.rollsTable.selectRollByRollId(rollId);

        Integer score = scoring.calculateScore(roll);

        return new ScoreResult(score);
    }
}
