package Factories;

import ScoringServices.*;
import models.Scoring;
import org.junit.Before;
import org.junit.Test;

import static models.ScoringEnums.*;
import static org.junit.Assert.assertEquals;

public class ScoringFactoryTests {

    private ScoringFactory factory;

    @Before
    public void Setup() {
        factory = new ScoringFactory();
    }

    @Test
    public void create_ShouldReturnFullHouseObjectWhenScoringFullHouse() {
        Scoring actual = factory.create(FULL_HOUSE);

        assertEquals(FullHouse.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnLargeStraightObjectWhenScoringLargeStraight() {
        Scoring actual = factory.create(LARGE_STRAIGHT);

        assertEquals(LargeStraight.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnSmallStraightObjectWhenScoringSmallStraight() {
        Scoring actual = factory.create(SMALL_STRAIGHT);

        assertEquals(SmallStraight.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnYahtzeeObjectWhenScoringYahtzee() {
        Scoring actual = factory.create(YAHTZEE);

        assertEquals(Yahtzee.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnOnesObjectWhenScoringOnes() {
        Scoring actual = factory.create(ONES);

        assertEquals(Ones.class, actual.getClass());
    }
}
