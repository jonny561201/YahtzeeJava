package ScoringServices;

import models.Die;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FullHouseTests {

    private FullHouse fullHouse;

    @Before
    public void Setup() {
        fullHouse = new FullHouse();
    }

    @Test
    public void calculateScore_ShouldReturnZeroWhenNotValidFullHouse() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(2), new Die(3));

        int actual = fullHouse.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_ShouldReturnZeroWhenTwoSetsWithoutFullHouse() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(1), new Die(2));

        int actual = fullHouse.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_ShouldReturnZeroWhenTwoSetsAndLastSetHasFourItems() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(2), new Die(2), new Die(2), new Die(2));

        int actual = fullHouse.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_ShouldReturnTwentyFiveWhenValidFullHouse() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(2), new Die(2));

        int actual = fullHouse.calculateScore(dice);

        assertEquals(25, actual);
    }

}
