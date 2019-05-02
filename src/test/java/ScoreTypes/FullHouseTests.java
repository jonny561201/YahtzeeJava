package ScoreTypes;

import models.Die;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FullHouseTests {

    private FullHouse fullHouse;

    @Before
    public void Setup() {
        fullHouse = new FullHouse();
    }

    @Test
    public void validate_ShouldReturnFalseWhenNotValidFullHouse() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(2), new Die(3));

        boolean actual = fullHouse.validate(dice);

        assertFalse(actual);
    }

    @Test
    public void validate_ShouldReturnTrueWhenValidFullHouse() {
        List<Die> dice = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(2), new Die(2));

        boolean actual = fullHouse.validate(dice);

        assertTrue(actual);
    }

}
