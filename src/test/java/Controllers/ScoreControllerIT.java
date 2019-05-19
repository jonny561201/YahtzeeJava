package Controllers;

import Factories.ScoringFactory;
import Repositories.RollsTable;
import models.Die;
import models.ScoreResult;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ScoreControllerIT {

    private UUID rollId;
    private RollsTable rollsTable;
    private ScoringFactory factory;
    private ScoreController controller;

    @Before
    public void setup() {
        rollId = UUID.randomUUID();
        factory = new ScoringFactory();
        rollsTable = mock(RollsTable.class);
        controller = new ScoreController(factory, rollsTable);
    }

    @Test
    public void score_ShouldSuccessfullyReturnScore() {
        String scoreType = "Twos";
        List<Die> roll = Arrays.asList(new Die(2), new Die(2), new Die(5), new Die(6), new Die(2));
        when(rollsTable.selectRollByPlayerGame(rollId)).thenReturn(roll);

        ScoreResult actual = controller.score(scoreType, rollId);

        Integer expectedScore = 6;
        assertEquals(expectedScore, actual.getScore());
    }
}
