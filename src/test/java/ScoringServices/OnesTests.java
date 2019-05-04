package ScoringServices;

import models.Die;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OnesTests {

    @Test
    public void calculateScore_shouldReturnZeroWhenInvalidOnes() {
        Ones ones = new Ones();
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(2), new Die(2));

        int actual = ones.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_shouldReturnOneWhenSingluarOnePip() {
        Ones ones = new Ones();
        List<Die> dice = Arrays.asList(new Die(1), new Die(2), new Die(2), new Die(2), new Die(2));

        int actual = ones.calculateScore(dice);

        assertEquals(1, actual);
    }

}
