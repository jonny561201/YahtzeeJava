package ScoringServices;

import models.Die;
import models.Scoring;
import models.ScoringEnums;

import java.util.List;
import java.util.stream.Collectors;

public class NumberScores extends Scoring {

    private ScoringEnums number;

    public NumberScores(ScoringEnums number) {
        this.number = number;
    }

    public Integer calculateScore(List<Die> dice) {
        List<Die> ones = dice.stream()
                .filter(x -> x.getPips() == number.value).collect(Collectors.toList());
        return ones.size() * number.value;
    }
}
