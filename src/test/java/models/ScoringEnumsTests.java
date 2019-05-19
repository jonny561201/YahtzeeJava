package models;

import org.junit.Test;

import static models.ScoringEnums.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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

    @Test
    public void parse_ShouldTranslateOnesStringToEnum() {
        String scoreType = "Ones";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(ONES, actual);
    }

    @Test
    public void parse_ShouldTranslateTwosStringToEnum() {
        String scoreType = "Twos";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(TWOS, actual);
    }

    @Test
    public void parse_ShouldTranslateThreesStringToEnum() {
        String scoreType = "Threes";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(THREES, actual);
    }

    @Test
    public void parse_ShouldTranslateFoursStringToEnum() {
        String scoreType = "Fours";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(FOURS, actual);
    }

    @Test
    public void parse_ShouldTranslateFivesStringToEnum() {
        String scoreType = "Fives";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(FIVES, actual);
    }

    @Test
    public void parse_ShouldTranslateSixesStringToEnum() {
        String scoreType = "Sixes";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(SIXES, actual);
    }

    @Test
    public void parse_ShouldTranslateThreeOfAKindStringToEnum() {
        String scoreType = "Three of a Kind";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(THREE_OF_A_KIND, actual);
    }

    @Test
    public void parse_ShouldTranslateFourOfAKindStringToEnum() {
        String scoreType = "Four of a Kind";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(FOUR_OF_A_KIND, actual);
    }

    @Test
    public void parse_ShouldTranslateWithRandomCapitalization() {
        String scoreType = "YaHtzEe";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(YAHTZEE, actual);
    }

    @Test
    public void parse_ShouldDefaultToNull() {
        String scoreType = "badEnum";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertNull(actual);
    }
}
