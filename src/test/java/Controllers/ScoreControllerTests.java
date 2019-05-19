package Controllers;

import Factories.ScoringFactory;
import models.ScoreResult;
import models.ScoringEnums;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ScoreControllerTests {

    @Test
    public void score_ShouldCallScoringFactoryForFullHouse() {
        //arrange
        ScoringFactory factory = mock(ScoringFactory.class);
        ScoreController controller = new ScoreController(factory);
        String scoreType = "Full House";
        //act
        controller.score(scoreType);
        //assert
        verify(factory, times(1)).create(ScoringEnums.FULL_HOUSE);
    }

    @Test
    public void score_ShouldCallScoringFactoryForLargeStraight() {
        //arrange
        ScoringFactory factory = mock(ScoringFactory.class);
        ScoreController controller = new ScoreController(factory);
        String scoreType = "Large Straight";
        //act
        controller.score(scoreType);
        //assert
        verify(factory, times(1)).create(ScoringEnums.LARGE_STRAIGHT);
    }


}
