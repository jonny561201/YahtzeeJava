package com.Controllers;

import com.Factories.ScoringFactory;
import com.Repositories.RollsTable;
import com.models.Die;
import com.models.ScoreResponse;
import com.models.Scoring;
import com.models.ScoringEnums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class ScoreController {

    private final ScoringFactory factory;
    private final RollsTable rollsTable;

    @Autowired
    public ScoreController(ScoringFactory factory, RollsTable rollsTable) {
        this.factory = factory;
        this.rollsTable = rollsTable;
    }

    public ScoreResponse score(String scoreType, UUID rollId) {
        ScoringEnums scoreEnum = ScoringEnums.parse(scoreType);
        Scoring scoring = this.factory.create(scoreEnum);
        List<Die> roll = Collections.singletonList(new Die(3));

        Integer score = scoring.calculateScore(roll);

        return new ScoreResponse(score);
    }
}
