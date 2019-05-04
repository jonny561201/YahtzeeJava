package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.List;
import java.util.stream.Collectors;

public class Yahtzee extends Scoring {
    public Integer calculateScore(List<Die> dice) {

        int primeValue = dice.get(0).getPips();
        boolean isValid = true;

        for (Die die : dice) {
            if (die.getPips() != primeValue) {
                isValid = false;
            }
        }

        return isValid ? 50 : 0;
    }
}
