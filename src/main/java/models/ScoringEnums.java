package models;

import java.util.stream.Stream;

public enum ScoringEnums {
    FULL_HOUSE(null),
    LARGE_STRAIGHT(null),
    SMALL_STRAIGHT(null),
    YAHTZEE(null),
    ONES(1),
    TWOS(2),
    THREES(3),
    FOURS(4),
    FIVES(5),
    SIXES(6),
    THREE_OF_A_KIND(3),
    FOUR_OF_A_KIND(4);

    public Integer value;

    ScoringEnums(Integer value){
        this.value = value;
    }

    public static ScoringEnums parse(String scoreType) {
        return Stream.of(ScoringEnums.values())
                .filter(x -> stringifyEnum(x).equals(scoreType.trim().toUpperCase()))
                .findFirst().orElse(null);
    }

    private static String stringifyEnum(ScoringEnums enumName) {
        return enumName.toString().replace("_", " ").toUpperCase();
    }
}
