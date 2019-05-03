package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SmallStraight extends Scoring {
    public Integer calculateScore(List<Die> dice) {
        Set<Integer> pipSet = dice.stream().map(x -> x.getPips()).collect(Collectors.toSet());
        return areValidUniquePips(pipSet) && isSequential(pipSet) ? 30 : 0;
    }

    private boolean areValidUniquePips(Set<Integer> pipSet) {
        return pipSet.size() >= 4;
    }

    private boolean isSequential(Set<Integer> pipSet) {
        List<Integer> validLow = Arrays.asList(1,2,3,4);
        List<Integer> validMiddle = Arrays.asList(2,3,4,5);
        return pipSet.containsAll(validLow) || pipSet.containsAll(validMiddle);
    }
}
