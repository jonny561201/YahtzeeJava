package models;

import java.util.stream.Stream;

public enum ScoringEnums {
    FULL_HOUSE(null, "FULLHOUSE"),
    LARGE_STRAIGHT(null, "LARGESTRAIGHT"),
    SMALL_STRAIGHT(null, "SMALLSTRAIGHT"),
    YAHTZEE(null, "YAHTZEE"),
    ONES(1, "ONES"),
    TWOS(2, "TWOS"),
    THREES(3, "THREES"),
    FOURS(4, "FOURS"),
    FIVES(5, "FIVES"),
    SIXES(6, "SIXES"),
    THREE_OF_A_KIND(3, "THREEOFAKIND"),
    FOUR_OF_A_KIND(4, "FOUROFAKIND");

    public Integer value;
    public String name;

    ScoringEnums(Integer value, String name){
        this.value = value;
        this.name = name;
    }

    public static ScoringEnums parse(String scoreType) {
        String cleanedScoreType = cleanScoreType(scoreType);
        return Stream.of(ScoringEnums.values())
                .filter(x -> x.name.equals(cleanedScoreType))
                .findFirst().orElse(null);
    }

    private static String cleanScoreType(String scoreType) {
        return scoreType.trim().replace(" ", "").replace("_", "").toUpperCase();
    }
}
