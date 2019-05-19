package models;

import org.junit.Test;

import static models.ScoringEnums.FULL_HOUSE;
import static models.ScoringEnums.LARGE_STRAIGHT;
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
}
