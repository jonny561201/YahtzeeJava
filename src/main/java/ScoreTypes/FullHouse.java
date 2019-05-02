package ScoreTypes;

import models.Die;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FullHouse {
    public boolean validate(List<Die> dice) {
        Set<Integer> collect = dice.stream()
                .map(x -> x.getPips()).collect(Collectors.toSet());
        return collect.size() == 2;
    }
}
