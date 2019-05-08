package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeOfAKind extends Scoring {

    public Integer calculateScore(List<Die> dice) {
        Set<Integer> pipSet = dice.stream().map(x -> x.getPips()).collect(Collectors.toSet());
        return (pipSet.size() <= 3) ? 20 : 0;
    }
}
