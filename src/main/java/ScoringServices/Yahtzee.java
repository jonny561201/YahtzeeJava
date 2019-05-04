package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.List;
import java.util.stream.Collectors;

public class Yahtzee extends Scoring {
    public Integer calculateScore(List<Die> dice) {
        return isValidYahtzee(dice) ? 50 : 0;
    }

    private boolean isValidYahtzee(List<Die> dice) {
        return dice.stream()
                .map(x -> x.getPips())
                .collect(Collectors.toSet())
                .size() == 1;
    }
}
