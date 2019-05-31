package com.Controllers;

import com.models.ScoreRequest;
import com.models.ScoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    private ScoreController scoreController;

    @Autowired
    public RestController(ScoreController scoreController) {
        this.scoreController = scoreController;
    }

    @PostMapping("/scoreRoll")
    public ScoreResponse scoreRoll(@RequestBody ScoreRequest request) {
        return scoreController.score(request.getScoreType(), request.getRollId());
    }
}
