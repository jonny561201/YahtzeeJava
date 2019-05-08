package ScoringServices;

import models.Die;
import models.Scoring;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OfAKind extends Scoring {
    private int number;

    public OfAKind(int number) {
        this.number = number;
    }

    public Integer calculateScore(List<Die> dice) {
        Set<Integer> pipSet = dice.stream().map(x -> x.getPips()).collect(Collectors.toSet());
        return (pipSet.size() <= expectedSetSize()) ? 20 : 0;
    }

    private int expectedSetSize() {
        return number == 3 ? 3 : 2;
    }
}
