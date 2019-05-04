package ScoringServices;

import models.Die;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OnesTests {

    private Ones ones;

    @Before
    public void setUp() {
        ones = new Ones();
    }

    @Test
    public void calculateScore_shouldReturnZeroWhenInvalidOnes() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(2), new Die(2));

        int actual = ones.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_shouldReturnOneWhenSingluarOnePip() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(2), new Die(2), new Die(2), new Die(2));

        int actual = ones.calculateScore(dice);

        assertEquals(1, actual);
    }

    @Test
    public void calculateScore_shouldReturnFivePointsWhenFedFiveOnes() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(1), new Die(1));

        int actual = ones.calculateScore(dice);

        assertEquals(5, actual);
    }

}
