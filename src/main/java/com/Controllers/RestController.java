package com.Controllers;

import com.models.ScoreResult;

import java.util.UUID;

public class RestController {

    private ScoreController scoreController;

    public RestController(ScoreController scoreController) {
        this.scoreController = scoreController;
    }


    public ScoreResult scoreRoll(String scoreType, UUID rollId) {
        return scoreController.score(scoreType, rollId);
    }
}
