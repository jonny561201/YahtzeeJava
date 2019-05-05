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
    SIXES(6);

    public Integer values;

    ScoringEnums(Integer values){
        this.values = values;
    }
}
