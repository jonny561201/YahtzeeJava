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
    public void create_ShouldReturnNumberScoreObjectWhenScoringOnes() {
        Scoring actual = factory.create(ONES);

        assertEquals(NumberScores.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnNumberScoreObjectWhenScoringTwos() {
        Scoring actual = factory.create(TWOS);

        assertEquals(NumberScores.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnNumberScoreObjectWhenScoringThrees() {
        Scoring actual = factory.create(THREES);

        assertEquals(NumberScores.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnNumberScoreObjectWhenScoringFours() {
        Scoring actual = factory.create(FOURS);

        assertEquals(NumberScores.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnNumberScoreObjectWhenScoringFives() {
        Scoring actual = factory.create(FIVES);

        assertEquals(NumberScores.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnNumberScoreObjectWhenScoringSixes() {
        Scoring actual = factory.create(SIXES);

        assertEquals(NumberScores.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnThreeOfAKindObjectWhenScoringThreeOfAKind() {
        Scoring actual = factory.create(THREE_OF_A_KIND);

        assertEquals(OfAKind.class, actual.getClass());
    }

    @Test
    public void create_ShouldReturnFourOfAKindObjectWhenScoringFourOfAKind() {
        Scoring actual = factory.create(FOUR_OF_A_KIND);

        assertEquals(OfAKind.class, actual.getClass());
    }
}
