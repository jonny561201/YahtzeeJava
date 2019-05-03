package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LargeStraight extends Scoring {
    public Integer calculateScore(List<Die> dice) {
        List<Integer> pips = dice.stream().map(x -> x.getPips()).collect(Collectors.toList());
        HashSet<Integer> pipSet = new HashSet<>(pips);

        return pipSet.size() == 5 && !(pips.contains(1) && pips.contains(6)) ? 40 : 0;
    }
}
