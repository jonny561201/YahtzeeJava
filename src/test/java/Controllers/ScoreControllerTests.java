package Controllers;

import Factories.ScoringFactory;
import Repositories.RollsTable;
import models.ScoreResult;
import models.ScoringEnums;
import org.junit.Before;
import org.junit.Test;

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
    }

    @Test
    public void score_ShouldCallScoringFactoryForFullHouse() {
        //arrange
        String scoreType = "Full House";
        //act
        controller.score(scoreType, rollId);
        //assert
        verify(factory, times(1)).create(ScoringEnums.FULL_HOUSE);
    }

    @Test
    public void score_ShouldCallScoringFactoryForLargeStraight() {
        //arrange
        String scoreType = "Large Straight";
        //act
        controller.score(scoreType, rollId);
        //assert
        verify(factory, times(1)).create(ScoringEnums.LARGE_STRAIGHT);
    }

    @Test
    public void score_ShouldCallDatabaseToGetRollDie() {
        String scoreType = "Yahtzee";
        controller.score(scoreType, rollId);

        verify(rollsTable, times(1)).selectRollByPlayerGame(rollId);
    }

}
