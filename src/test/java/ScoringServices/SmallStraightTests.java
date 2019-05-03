package ScoringServices;

import models.Die;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SmallStraightTests {

    @Test
    public void calculateScore_ShouldReturnZeroWhenNotAValidSmallStraight() {
        SmallStraight straight = new SmallStraight();
        List<Die> dice = Arrays.asList(new Die(2), new Die(3), new Die(4), new Die(2), new Die(3));

        int actual = straight.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_ShouldReturnThirtyWhenValidSmallStraight() {
        SmallStraight straight = new SmallStraight();
        List<Die> dice = Arrays.asList(new Die(2), new Die(3), new Die(4), new Die(5), new Die(3));

        int actual = straight.calculateScore(dice);

        assertEquals(30, actual);
    }

    @Test
    public void calculateScore_ShouldReturnThirtyWhenValidSmallStraightWhenMoreThanFourUniquePips() {
        SmallStraight straight = new SmallStraight();
        List<Die> dice = Arrays.asList(new Die(2), new Die(3), new Die(4), new Die(5), new Die(6));

        int actual = straight.calculateScore(dice);

        assertEquals(30, actual);
    }
}
