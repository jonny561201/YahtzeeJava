package com.ScoringServices;

import com.models.Die;
import com.models.Scoring;
import com.models.ScoringEnums;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OfAKind extends Scoring {
    private ScoringEnums number;

    public OfAKind(ScoringEnums number) {
        this.number = number;
    }

    public Integer calculateScore(List<Die> dice) {
        Set<Integer> pipSet = dice.stream().map(x -> x.getPips()).collect(Collectors.toSet());
        return (pipSet.size() <= expectedSetSize()) ? 20 : 0;
    }

    private int expectedSetSize() {
        return number.value == 3 ? 3 : 2;
    }
}
