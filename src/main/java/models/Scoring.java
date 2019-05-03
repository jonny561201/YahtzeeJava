package models;

import java.util.List;

public abstract class Scoring {

    public abstract Integer calculateScore(List<Die> dice);
}
