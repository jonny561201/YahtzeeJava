package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.List;
import java.util.stream.Collectors;

public class NumberScores extends Scoring {

    private int number;

    public NumberScores(int number) {
        this.number = number;
    }

    public Integer calculateScore(List<Die> dice) {

        List<Die> ones = dice.stream().filter(x -> x.getPips() == number).collect(Collectors.toList());
        return ones.size() * number;
    }
}
