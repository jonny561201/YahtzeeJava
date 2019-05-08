package ScoringServices;

import models.Die;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static models.ScoringEnums.FOUR_OF_A_KIND;
import static models.ScoringEnums.THREE_OF_A_KIND;
import static org.junit.Assert.assertEquals;

public class OfAKindTests {

    private OfAKind threeOfAKind;
    private OfAKind fourOfAKind;

    @Before
    public void setUp() {
        threeOfAKind = new OfAKind(THREE_OF_A_KIND);
        fourOfAKind = new OfAKind(FOUR_OF_A_KIND);
    }

    @Test
    public void calculateScore_shouldReturnZeroForInvalidThreeOfAKind() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(2), new Die(3), new Die(4), new Die(5));

        int actual = threeOfAKind.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_shouldReturnTwentyIfPipSetEqualsThree() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(4), new Die(5));

        int actual = threeOfAKind.calculateScore(dice);

        assertEquals(20, actual);
    }

    @Test
    public void calculateScore_shouldReturnTwentyIfPipSetIsLessThanThree() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(2), new Die(4));

        int actual = threeOfAKind.calculateScore(dice);

        assertEquals(20, actual);
    }

    @Test
    public void calculateScore_shouldReturnZeroForInvalidFourOfAKind() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(3), new Die(3), new Die(4));

        int actual = fourOfAKind.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_shouldReturnTwentyForExactlyFourOfAKind() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(3), new Die(2));

        int actual = fourOfAKind.calculateScore(dice);

        assertEquals(20, actual);
    }

    @Test
    public void calculateScore_shouldReturnTwentyForMoreThanFourOfAKind() {
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(2), new Die(2));

        int actual = fourOfAKind.calculateScore(dice);

        assertEquals(20, actual);
    }

}
