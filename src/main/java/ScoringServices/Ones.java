package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.List;
import java.util.stream.Collectors;

public class Ones extends Scoring {
    final int EXPECTED_VALUE = 1;

    public Integer calculateScore(List<Die> dice) {

        List<Die> ones = dice.stream().filter(x -> x.getPips() == EXPECTED_VALUE).collect(Collectors.toList());
        return ones.size();
    }
}
