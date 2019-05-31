package com.Controllers;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.mockito.Mockito.*;

public class RestControllerTest {

    private RestController controller;
    private ScoreController scoreController;

    @Before
    public void setup() {
        scoreController = mock(ScoreController.class);
        controller = new RestController(scoreController);
    }

    @Test
    public void scoreRoll_should_call_score_controller() {
        String scoreType = "Yahtzee";
        UUID rollId = UUID.randomUUID();

        controller.scoreRoll(scoreType, rollId);

        verify(scoreController, times(1)).score(scoreType, rollId);
    }

}