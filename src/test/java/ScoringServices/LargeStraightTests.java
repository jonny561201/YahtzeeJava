package ScoringServices;

import models.Die;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LargeStraightTests {

    @Test
    public void calculateScore_ShouldReturnZeroIfNotAStraight() {
        LargeStraight straight = new LargeStraight();
        List<Die> dice = Arrays.asList(new Die(1), new Die(2), new Die(4), new Die(2), new Die(3));

        int actual = straight.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_ShouldReturnFortyIfALargeStraight() {
        LargeStraight straight = new LargeStraight();
        List<Die> dice = Arrays.asList(new Die(2), new Die(3), new Die(4), new Die(5), new Die(6));

        int actual = straight.calculateScore(dice);

        assertEquals(40, actual);
    }
}
