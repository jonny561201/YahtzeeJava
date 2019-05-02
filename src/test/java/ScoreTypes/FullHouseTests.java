package ScoreTypes;

import models.Die;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;

public class FullHouseTests {

    private FullHouse fullHouse;

    @Before
    public void Setup() {
        fullHouse = new FullHouse();
    }

    @Test
    public void validate_ShouldReturnFalseWhenNotValidFullHouse() {
        //arrange
        List<Die> dice = Arrays.asList(new Die(1), new Die(1), new Die(1), new Die(2), new Die(3));
        //act
        boolean actual = fullHouse.validate(dice);
        //assert
        assertFalse(actual);
    }

}
