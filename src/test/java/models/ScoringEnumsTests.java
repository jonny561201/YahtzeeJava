package models;

import org.junit.Test;

import static models.ScoringEnums.*;
import static org.junit.Assert.assertEquals;

public class ScoringEnumsTests {

    @Test
    public void parse_ShouldTranslateFullHouseStringToEnum() {
        String scoreType = "Full House";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(FULL_HOUSE, actual);
    }

    @Test
    public void parse_ShouldTranslateLargeStraightStringToEnum() {
        String scoreType = "Large Straight";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(LARGE_STRAIGHT, actual);
    }

    @Test
    public void parse_ShouldTranslateSmallStraightStringToEnum() {
        String scoreType = "Small Straight";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(SMALL_STRAIGHT, actual);
    }

    @Test
    public void parse_ShouldTranslateYahtzeeStringToEnum() {
        String scoreType = "Yahtzee";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(YAHTZEE, actual);
    }
}
