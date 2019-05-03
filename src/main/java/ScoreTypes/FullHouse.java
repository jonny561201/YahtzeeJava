package ScoreTypes;

import models.Die;

import java.util.*;
import java.util.stream.Collectors;

public class FullHouse {

    public Integer calculateScore(List<Die> dice) {
        return !isValid(dice) ? 0 : 25;
    }

    private boolean isValid(List<Die> dice) {
        List<Integer> collect = dice.stream()
                .map(x -> x.getPips()).collect(Collectors.toList());

        HashSet<Integer> set = new HashSet<>(collect);
        boolean hasMatch = hasCorrectSets(collect, set);

        return set.size() == 2 && hasMatch;
    }

    private boolean hasCorrectSets(List<Integer> collect, HashSet<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        int firstValue = Collections.frequency(collect, list.get(0));
        int secondValue = Collections.frequency(collect, list.get(1));

        return firstValue <= 3 && secondValue <= 3;
    }
}
