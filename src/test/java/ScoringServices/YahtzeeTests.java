package ScoringServices;

import models.Die;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class YahtzeeTests {

    @Test
    public void calculateScore_shouldReturnZeroForInvalidYahtzee() {
        List<Die> dice = Arrays.asList(new Die(4), new Die(4), new Die(4), new Die(4), new Die(1));
        Yahtzee yahtzee = new Yahtzee();

        int actual = yahtzee.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_shouldReturnFiftyPointsForYahtzee() {
        List<Die> dice = Arrays.asList(new Die(4), new Die(4), new Die(4), new Die(4), new Die(4));
        Yahtzee yahtzee = new Yahtzee();

        int actual = yahtzee.calculateScore(dice);

        assertEquals(50, actual);
    }
}
