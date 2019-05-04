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

    @Test
    public void calculateScore_shouldReturnEightPointsWhenFedFourTwos() {
        numberScores = new NumberScores(2);
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(5), new Die(2), new Die(2));

        int actual = numberScores.calculateScore(dice);

        assertEquals(8, actual);
    }

    @Test
    public void calculateScore_shouldReturnSixPointsWhenFedTwoThrees() {
        numberScores = new NumberScores(3);
        List<Die> dice = Arrays.asList(new Die(2), new Die(3), new Die(5), new Die(3), new Die(2));

        int actual = numberScores.calculateScore(dice);

        assertEquals(6, actual);
    }

    @Test
    public void calculateScore_shouldReturnTwentyPointsWhenFedFiveFours() {
        numberScores = new NumberScores(4);
        List<Die> dice = Arrays.asList(new Die(4), new Die(4), new Die(4), new Die(4), new Die(4));

        int actual = numberScores.calculateScore(dice);

        assertEquals(20, actual);
    }

    @Test
    public void calculateScore_shouldReturnFifteenPointsWhenFedThreeFives() {
        numberScores = new NumberScores(5);
        List<Die> dice = Arrays.asList(new Die(5), new Die(5), new Die(5), new Die(1), new Die(1));

        int actual = numberScores.calculateScore(dice);

        assertEquals(15, actual);
    }

    @Test
    public void calculateScore_shouldReturnTwelvePointsWhenFedTwoSixes() {
        numberScores = new NumberScores(6);
        List<Die> dice = Arrays.asList(new Die(5), new Die(5), new Die(5), new Die(6), new Die(6));

        int actual = numberScores.calculateScore(dice);

        assertEquals(12, actual);
    }
}
