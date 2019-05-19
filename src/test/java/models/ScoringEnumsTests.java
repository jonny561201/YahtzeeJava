package models;

import org.junit.Test;

import static models.ScoringEnums.FULL_HOUSE;
import static org.junit.Assert.assertEquals;

public class ScoringEnumsTests {

    @Test
    public void parse_ShouldTranslateFullHouseStringToEnum() {
        String scoreType = "Full House";
        ScoringEnums actual = ScoringEnums.parse(scoreType);
        assertEquals(FULL_HOUSE, actual);
    }
}
