package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LargeStraight extends Scoring {
    public Integer calculateScore(List<Die> dice) {
        Set<Integer> distinct = dice.stream().map(x -> x.getPips()).collect(Collectors.toSet());
        return distinct.size() == 5 ? 40 : 0;
    }
}
