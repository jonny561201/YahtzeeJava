package com.Controllers;

import com.Factories.ScoringFactory;
import com.Repositories.RollsTable;
import com.ScoringServices.NumberScores;
import com.models.Die;
import com.models.ScoringEnums;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.mockito.Mockito.*;

public class ScoreControllerTests {

    private ScoringFactory factory;
    private RollsTable rollsTable;
    private ScoreController controller;
    private UUID rollId;

    @Before
    public void setup() {
        rollId = UUID.randomUUID();
        rollsTable = mock(RollsTable.class);
        factory = mock(ScoringFactory.class);
        controller = new ScoreController(factory, rollsTable);

        List<Die> roll = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(1), new Die(1));
        when(factory.create(any(ScoringEnums.class))).thenReturn(new NumberScores(ScoringEnums.THREES));
        when(rollsTable.selectRollByRollId(any(UUID.class))).thenReturn(roll);
    }

    @Test
    public void score_ShouldCallScoringFactoryForFullHouse() {
        String scoreType = "Full House";

        controller.score(scoreType, rollId);

        verify(factory, times(1)).create(ScoringEnums.FULL_HOUSE);
    }

    @Test
    public void score_ShouldCallScoringFactoryForLargeStraight() {
        String scoreType = "Large Straight";

        controller.score(scoreType, rollId);

        verify(factory, times(1)).create(ScoringEnums.LARGE_STRAIGHT);
    }

    @Test
    public void score_ShouldCallDatabaseToGetRollDie() {
        String scoreType = "Yahtzee";

        controller.score(scoreType, rollId);

        verify(rollsTable, times(1)).selectRollByRollId(rollId);
    }

}
