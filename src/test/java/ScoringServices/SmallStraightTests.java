package ScoringServices;

import models.Die;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SmallStraightTests {

    private SmallStraight straight;

    @Before
    public void Setup() {
        straight = new SmallStraight();
    }

    @Test
    public void calculateScore_ShouldReturnZeroWhenNotAValidSmallStraight() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(3), new Die(4), new Die(2), new Die(3));

        int actual = straight.calculateScore(dice);

        assertEquals(0, actual);
    }


    @Test
    public void calculateScore_ShouldReturnThirtyWhenValidSmallStraightWhenMoreThanFourUniquePips() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(3), new Die(4), new Die(5), new Die(6));

        int actual = straight.calculateScore(dice);

        assertEquals(30, actual);
    }

    @Test
    public void calculateScore_ShouldReturnZeroWhenNonSequentialSetOfFour() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(2), new Die(4), new Die(5), new Die(6));

        int actual = straight.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_ShouldReturnThirtyWhenValidLowerSmallStraight() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(3), new Die(4), new Die(6), new Die(2));

        int actual = straight.calculateScore(dice);

        assertEquals(30, actual);
    }

    @Test
    public void calculateScore_ShouldReturnThirtyWhenValidMiddleSmallStraight() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(3), new Die(4), new Die(5), new Die(3));

        int actual = straight.calculateScore(dice);

        assertEquals(30, actual);
    }

    @Test
    public void calculateScore_ShouldReturnThirtyWhenValidUpperSmallStraight() {
        List<Die> dice = Arrays.asList(new Die(6), new Die(5), new Die(4), new Die(3), new Die(6));

        int actual = straight.calculateScore(dice);

        assertEquals(30, actual);
    }
}
