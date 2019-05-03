package ScoreTypes;

import models.Die;

import java.util.*;
import java.util.stream.Collectors;

public class FullHouse {
    public boolean validate(List<Die> dice) {
        boolean hasMatch = false;

        List<Integer> collect = dice.stream()
                .map(x -> x.getPips()).collect(Collectors.toList());

        HashSet<Integer> set = new HashSet<>(collect);
        List<Integer> list = new ArrayList<>(set);

        int firstValue = Collections.frequency(collect, list.get(0));
        int secondValue = Collections.frequency(collect, list.get(1));

        if (firstValue <= 3 && secondValue <= 3 ) {
            hasMatch = true;
        }

        return set.size() == 2 && hasMatch;
    }
}
