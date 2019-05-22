package com.ScoringServices;

import com.models.Die;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class YahtzeeTests {

    private Yahtzee yahtzee;

    @Before
    public void setUp() {
        yahtzee = new Yahtzee();
    }

    @Test
    public void calculateScore_shouldReturnZeroForInvalidYahtzee() {
        List<Die> dice = Arrays.asList(new Die(4), new Die(4), new Die(4), new Die(4), new Die(1));

        int actual = yahtzee.calculateScore(dice);

        assertEquals(0, actual);
    }

    @Test
    public void calculateScore_shouldReturnFiftyPointsForYahtzee() {
        List<Die> dice = Arrays.asList(new Die(4), new Die(4), new Die(4), new Die(4), new Die(4));

        int actual = yahtzee.calculateScore(dice);

        assertEquals(50, actual);
    }
}
