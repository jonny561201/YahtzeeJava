package models;

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
}
