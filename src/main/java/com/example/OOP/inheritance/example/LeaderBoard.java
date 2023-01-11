package com.example.OOP.inheritance.example;

import java.util.List;

public class LeaderBoard {

    private List<Integer> scores;

    public LeaderBoard() {}

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {

        if (scores.size() > 3) {
            throw new CustomBusinessException("The max number of sores on a leaderboard is 3!");
        } else {
            this.scores = scores;
        }
    }

}
