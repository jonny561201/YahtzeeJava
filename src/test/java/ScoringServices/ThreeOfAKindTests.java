package ScoringServices;

import models.Die;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreeOfAKindTests {

    @Test
    public void calculateScore_shouldReturnZeroForInvalidThreeOfAKind() {
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        List<Die> dice = Arrays.asList(new Die(1), new Die(2), new Die(3), new Die(4), new Die(5));

        int actual = threeOfAKind.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_shouldReturnTwentyIfPipSetEqualsThree() {
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(4), new Die(5));

        int actual = threeOfAKind.calculateScore(dice);

        assertEquals(20, actual);
    }

    @Test
    public void calculateScore_shouldReturnTwentyIfPipSetIsLessThanThree() {
        ThreeOfAKind threeOfAKind = new ThreeOfAKind();
        List<Die> dice = Arrays.asList(new Die(2), new Die(2), new Die(2), new Die(2), new Die(4));

        int actual = threeOfAKind.calculateScore(dice);

        assertEquals(20, actual);
    }

}
