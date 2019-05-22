package com.models;

import java.util.UUID;

public class Roll {

    private UUID player_id;
    private UUID game_id;
    private int die1;
    private int die2;
    private int die3;
    private int die4;
    private int die5;


    public UUID getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(UUID player_id) {
        this.player_id = player_id;
    }

    public UUID getGame_id() {
        return game_id;
    }

    public void setGame_id(UUID game_id) {
        this.game_id = game_id;
    }

    public int getDie1() {
        return die1;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public int getDie2() {
        return die2;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }

    public int getDie3() {
        return die3;
    }

    public void setDie3(int die3) {
        this.die3 = die3;
    }

    public int getDie4() {
        return die4;
    }

    public void setDie4(int die4) {
        this.die4 = die4;
    }

    public int getDie5() {
        return die5;
    }

    public void setDie5(int die5) {
        this.die5 = die5;
    }
}
