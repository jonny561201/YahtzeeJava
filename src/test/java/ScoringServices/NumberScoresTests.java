package ScoringServices;

import models.Die;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberScoresTests {

    private NumberScores numberScores;

    @Test
    public void calculateScore_shouldReturnZeroWhenInvalidOnes() {
        numberScores = new NumberScores(1);
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(2), new Die(2));

        int actual = numberScores.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_shouldReturnOneWhenSingluarOnePip() {
        numberScores = new NumberScores(1);
        List<Die> dice = Arrays.asList(new Die(1), new Die(2), new Die(2), new Die(2), new Die(2));

        int actual = numberScores.calculateScore(dice);

        assertEquals(1, actual);
    }

    @Test
    public void calculateScore_shouldReturnFivePointsWhenFedFiveOnes() {
        numberScores = new NumberScores(1);
        List<Die> dice = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(1), new Die(1));

        int actual = numberScores.calculateScore(dice);

        assertEquals(5, actual);
    }

}
