package com.models;

import java.util.UUID;

public class ScoreRequest {

    private String scoreType;
    private UUID rollId;

    public ScoreRequest() {}

    public ScoreRequest(String scoreType, UUID rollId) {
        this.scoreType = scoreType;
        this.rollId = rollId;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    public UUID getRollId() {
        return rollId;
    }

    public void setRollId(UUID rollId) {
        this.rollId = rollId;
    }
}
