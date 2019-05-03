package Factories;

import ScoringServices.FullHouse;
import models.Scoring;
import org.junit.Before;
import org.junit.Test;

import static models.ScoringEnums.FULL_HOUSE;
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
}
